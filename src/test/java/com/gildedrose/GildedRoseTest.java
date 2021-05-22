package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testFrameworkWorks() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void systemLowersValues(){
        Item[] items = new Item[]{new Item("foo",15,25)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14,app.items[0].sellIn);
        assertEquals(24,app.items[0].quality);
    }

    @Test
    public void qualityDegradesTwiceAsFast(){
        Item[] items = new Item[]{new Item("foo",0,17)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(15,app.items[0].quality);
    }



}

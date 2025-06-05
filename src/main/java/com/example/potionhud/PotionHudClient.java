package com.example.potionhud;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.util.Identifier;

public class PotionHudClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Potion HUD (5zig style) initialized!");
    }

    // HUD描画ロジックは Mixin 等で追加してください（簡易サンプルでは省略）
}
package com.internshala.bookhub.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001cH\u0016J\u0006\u00105\u001a\u00020.J\u0006\u00106\u001a\u00020.R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00067"}, d2 = {"Lcom/internshala/bookhub/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getCoordinatorLayout", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "setCoordinatorLayout", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "frameLayout", "Landroid/widget/FrameLayout;", "getFrameLayout", "()Landroid/widget/FrameLayout;", "setFrameLayout", "(Landroid/widget/FrameLayout;)V", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "getNavigationView", "()Lcom/google/android/material/navigation/NavigationView;", "setNavigationView", "(Lcom/google/android/material/navigation/NavigationView;)V", "previousMenuItem", "Landroid/view/MenuItem;", "getPreviousMenuItem", "()Landroid/view/MenuItem;", "setPreviousMenuItem", "(Landroid/view/MenuItem;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "openDashboard", "setUpToolbar", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    @org.jetbrains.annotations.NotNull()
    public androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    public android.widget.FrameLayout frameLayout;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.navigation.NavigationView navigationView;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.Nullable()
    private android.view.MenuItem previousMenuItem;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.drawerlayout.widget.DrawerLayout getDrawerLayout() {
        return null;
    }
    
    public final void setDrawerLayout(@org.jetbrains.annotations.NotNull()
    androidx.drawerlayout.widget.DrawerLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.coordinatorlayout.widget.CoordinatorLayout getCoordinatorLayout() {
        return null;
    }
    
    public final void setCoordinatorLayout(@org.jetbrains.annotations.NotNull()
    androidx.coordinatorlayout.widget.CoordinatorLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.FrameLayout getFrameLayout() {
        return null;
    }
    
    public final void setFrameLayout(@org.jetbrains.annotations.NotNull()
    android.widget.FrameLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.navigation.NavigationView getNavigationView() {
        return null;
    }
    
    public final void setNavigationView(@org.jetbrains.annotations.NotNull()
    com.google.android.material.navigation.NavigationView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.MenuItem getPreviousMenuItem() {
        return null;
    }
    
    public final void setPreviousMenuItem(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setUpToolbar() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void openDashboard() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public MainActivity() {
        super();
    }
}
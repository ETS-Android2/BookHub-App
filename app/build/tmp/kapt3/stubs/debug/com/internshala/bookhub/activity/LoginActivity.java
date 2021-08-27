package com.internshala.bookhub.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020+H\u0014J\u0006\u0010/\u001a\u00020+R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u000e\u0010\'\u001a\u00020(X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/internshala/bookhub/activity/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnLogin", "Landroid/widget/Button;", "getBtnLogin", "()Landroid/widget/Button;", "setBtnLogin", "(Landroid/widget/Button;)V", "etMobileNumber", "Landroid/widget/EditText;", "getEtMobileNumber", "()Landroid/widget/EditText;", "setEtMobileNumber", "(Landroid/widget/EditText;)V", "etPassword", "getEtPassword", "setEtPassword", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "txtForgotPassword", "Landroid/widget/TextView;", "getTxtForgotPassword", "()Landroid/widget/TextView;", "setTxtForgotPassword", "(Landroid/widget/TextView;)V", "txtRegister", "getTxtRegister", "setTxtRegister", "validMobileNumber", "", "validPassword", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "savePreferences", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText etMobileNumber;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText etPassword;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button btnLogin;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtForgotPassword;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView txtRegister;
    private final java.lang.String validMobileNumber = "0123456789";
    private final java.lang.String validPassword = "Gullu";
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    public android.content.SharedPreferences sharedPreferences;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtMobileNumber() {
        return null;
    }
    
    public final void setEtMobileNumber(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEtPassword() {
        return null;
    }
    
    public final void setEtPassword(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getBtnLogin() {
        return null;
    }
    
    public final void setBtnLogin(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtForgotPassword() {
        return null;
    }
    
    public final void setTxtForgotPassword(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTxtRegister() {
        return null;
    }
    
    public final void setTxtRegister(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public final void savePreferences() {
    }
    
    public LoginActivity() {
        super();
    }
}
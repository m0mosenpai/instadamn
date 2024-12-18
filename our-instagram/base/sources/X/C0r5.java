package X;

import android.content.SharedPreferences;
import com.facebook.realtime.requeststream.client.SandboxConfigSource;

/* renamed from: X.0r5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0r5 implements SandboxConfigSource {
    public static final C15540q9 A01 = new Object();
    public final SharedPreferences A00;

    public C0r5(InterfaceC19630xq interfaceC19630xq) {
        this.A00 = new SharedPreferencesC19650xs(interfaceC19630xq);
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final String getBladerunnerSandbox() {
        return this.A00.getString("bladerunnerSandbox", null);
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final String getDistillerySandbox() {
        return this.A00.getString("distillerySandbox", null);
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final String getJavascriptSandbox() {
        return this.A00.getString("javascriptSandbox", null);
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final String getWwwSandbox() {
        return this.A00.getString("wwwSandbox", null);
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final void setBladerunnerSandbox(String str) {
        this.A00.edit().putString("bladerunnerSandbox", str).commit();
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final void setDistillerySandbox(String str) {
        this.A00.edit().putString("distillerySandbox", str).commit();
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final void setJavascriptSandbox(String str) {
        this.A00.edit().putString("javascriptSandbox", str).commit();
    }

    @Override // com.facebook.realtime.requeststream.client.SandboxConfigSource
    public final void setWwwSandbox(String str) {
        this.A00.edit().putString("wwwSandbox", str).commit();
    }
}

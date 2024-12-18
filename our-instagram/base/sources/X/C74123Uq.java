package X;

import android.content.Intent;
import java.util.Map;

/* renamed from: X.3Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74123Uq {
    public final C74083Um A00;
    public final C74083Um A01;
    public final C74083Um A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;
    public final java.util.Set A07;
    public final java.util.Set A08;
    public final java.util.Set A09;
    public final C74083Um A0A;
    public final C74083Um A0B;
    public final Map A0C;

    public C74123Uq(C74083Um c74083Um, C74083Um c74083Um2, C74083Um c74083Um3, C74083Um c74083Um4, C74083Um c74083Um5, Map map, Map map2, java.util.Set set, java.util.Set set2, java.util.Set set3) {
        this.A05 = "com.facebook.services";
        this.A04 = "com.facebook.services.dev";
        this.A03 = "com.facebook.oxygen.services.fbns.PreloadedFbnsService";
        this.A08 = set2;
        this.A06 = map;
        this.A07 = set;
        this.A0C = map2;
        this.A0A = c74083Um;
        this.A01 = c74083Um5;
        this.A0B = c74083Um4;
        this.A00 = c74083Um2;
        this.A02 = c74083Um3;
        this.A09 = set3;
    }

    public final InterfaceC127765q1 A00(Intent intent, C3VB c3vb) {
        C74083Um c74083Um = this.A0A;
        if (c74083Um.A00 != null) {
            C3Ug c3Ug = (C3Ug) ((C3Ui) c74083Um.A00()).A00.get(0);
            c3Ug.getClass();
            c3Ug.A01 = c3vb;
            c3Ug.A00 = intent;
            return c3Ug.A00();
        }
        throw new RuntimeException("IntentConfigProvider not bound in Fbns Config Manager");
    }

    public final InterfaceC127765q1 A01(Intent intent, C3VB c3vb) {
        C74083Um c74083Um = this.A0A;
        if (c74083Um.A00 != null) {
            C3Ug c3Ug = (C3Ug) ((C3Ui) c74083Um.A00()).A00.get(0);
            c3Ug.getClass();
            c3Ug.A01 = c3vb;
            c3Ug.A00 = intent;
            return c3Ug.A00();
        }
        throw new RuntimeException("IntentConfigProvider not bound in Fbns Config Manager");
    }

    public final C74103Uo A02() {
        C74083Um c74083Um = this.A0B;
        if (c74083Um.A00 != null) {
            return (C74103Uo) c74083Um.A00();
        }
        throw new RuntimeException("mPreferencesManagerProvider not bound in Fbns Config Manager");
    }

    public C74123Uq() {
    }
}

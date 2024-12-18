package X;

import android.os.Bundle;
import com.facebook.systrace.Systrace;
import com.instagram.urlhandler.WebAndUserExternalUrlHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.14J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14J {
    public static C14J A01;
    public static InterfaceC09390do A02;
    public static boolean A03;
    public static final C14K A04 = new Object();
    public final List A00;

    @Deprecated(message = "For deeplink handling, please use either [canHandleDFA] or one of the methods in\n        [com.instagram.url.DFAUrlHelper] instead. See: https://fburl.com/wiki/gerfwhhs")
    public final C3AY A00(AbstractC18680vv abstractC18680vv, String str) {
        if (str == null || abstractC18680vv == null) {
            return null;
        }
        for (InterfaceC37185GZw interfaceC37185GZw : this.A00) {
            Bundle AFg = interfaceC37185GZw.AFg(abstractC18680vv, str);
            if (AFg != null) {
                return new C3AY(interfaceC37185GZw, AFg);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.FvA, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.FvB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.GIC, java.lang.Object] */
    public C14J() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("initUrlHandlerHelper", 2097720336);
        }
        try {
            ArrayList arrayList = new ArrayList();
            this.A00 = arrayList;
            arrayList.add(new Object());
            arrayList.add(new Object());
            arrayList.add(new WebAndUserExternalUrlHandler(new Object(), new Object(), new Object()));
            arrayList.add(new GIA());
            arrayList.add(new Object());
            if (Systrace.A0E(1L)) {
                C0fO.A00(-179715908);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(14356510);
            }
            throw th;
        }
    }
}

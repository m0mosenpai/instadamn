package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.1Py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26431Py implements InterfaceC13060ls {
    public static final Map A02 = AbstractC06930Yk.A06(new C09530e4("350685531728", "com.facebook.katana"), new C09530e4("256002347743983", "com.facebook.orca"), new C09530e4("121876164619130", "com.facebook.pages.app"), new C09530e4("567067343352427", "com.instagram.android"), new C09530e4("881555691867714", "com.instagram.layout"), new C09530e4("3419628305025917", "com.instagram.barcelona"), new C09530e4("306069495113", "com.whatsapp"), new C09530e4("1548792348668883", "com.oculus.home"), new C09530e4("1437758943160428", "com.oculus.horizon"));
    public final Context A00;
    public final InterfaceC09390do A01;

    public C26431Py(Context context, C12N c12n) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c12n, 2);
        this.A00 = context;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A03, new C9EI(c12n, 8));
    }

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36326571396577251L)) {
            C19L c19l = (C19L) this.A01.getValue();
            C9D0 c9d0 = new C9D0(this, abstractC12990ll, (InterfaceC23621Ds) null, 6);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d0, c19l);
            return;
        }
        C3JO.A00(this.A00, abstractC12990ll);
    }
}

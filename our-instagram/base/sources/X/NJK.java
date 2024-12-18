package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NJK extends OX2 {
    public AnonymousClass840 A00;
    public AnonymousClass841 A01;
    public C47705L4m A02;
    public C52458NJc A03;
    public C55904Ort A04;
    public C50991Mfy A05;
    public InterfaceC58310Pt2 A06;
    public InterfaceC58168PqY A07;
    public AbstractC53643Nno A08;
    public AbstractC50867Mdy A09;
    public GZR A0A;
    public ODM A0B;
    public C55099ObA A0C;
    public C52253NAt A0D;
    public final Bundle A0E;
    public final C22P A0F;
    public final AbstractC59962oe A0G;
    public final InterfaceC11380iw A0H;
    public final UserSession A0I;
    public final C50699MZu A0J;
    public final OWR A0K;
    public final C200018t5 A0L;
    public final String A0M;
    public final InterfaceC09390do A0N;

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.OWR] */
    public NJK(Bundle bundle, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C22P c22p;
        C14360o3.A0B(userSession, 3);
        this.A0G = abstractC59962oe;
        this.A0E = bundle;
        this.A0I = userSession;
        this.A0H = interfaceC11380iw;
        if (bundle.get("ARG_POST_SHARE_CAMERA_ENTRY_POINT") instanceof C22P) {
            Object obj = bundle.get("ARG_POST_SHARE_CAMERA_ENTRY_POINT");
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
            c22p = (C22P) obj;
        } else {
            c22p = C22P.A5N;
        }
        this.A0F = c22p;
        C50699MZu A00 = AbstractC50666MYj.A00(userSession);
        this.A0J = A00;
        String str = A00.A02;
        if (str == null) {
            str = C6WI.A02();
            C14360o3.A07(str);
        }
        this.A0M = str;
        this.A0L = new C200018t5(userSession);
        this.A0K = new Object();
        this.A07 = new P0J(abstractC59962oe, interfaceC11380iw, userSession);
        this.A0N = AbstractC09440dt.A01(C57525Pfz.A00(this, 15));
    }

    public final AnonymousClass841 A07() {
        AnonymousClass841 anonymousClass841 = this.A01;
        if (anonymousClass841 != null) {
            return anonymousClass841;
        }
        C14360o3.A0F("_session");
        throw C00O.createAndThrow();
    }

    public final C52458NJc A08() {
        C52458NJc c52458NJc = this.A03;
        if (c52458NJc != null) {
            return c52458NJc;
        }
        C14360o3.A0F("dataProvider");
        throw C00O.createAndThrow();
    }

    public final C55099ObA A09() {
        C55099ObA c55099ObA = this.A0C;
        if (c55099ObA != null) {
            return c55099ObA;
        }
        C14360o3.A0F("productTagRowController");
        throw C00O.createAndThrow();
    }
}

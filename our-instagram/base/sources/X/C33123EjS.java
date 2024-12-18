package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EjS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33123EjS extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C2n2 A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33123EjS(Activity activity, AbstractC10360h2 abstractC10360h2, C2n2 c2n2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Boolean bool, Runnable runnable, String str, String str2, String str3) {
        super(abstractC10360h2);
        this.A01 = c2n2;
        this.A04 = bool;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = runnable;
        this.A00 = activity;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1440349183);
        C9GR.A0E(this.A00, "fetch_location_permalink_failed");
        AbstractC73317Y7a.A0H(this.A02, this.A03, this.A07, this.A06, this.A08, abstractC115105If.A01());
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(141163810, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-122674289);
        C32178EBz c32178EBz = (C32178EBz) obj;
        int A032 = C0f9.A03(-1774623520);
        this.A01.apply(c32178EBz.A00);
        if (this.A04.booleanValue()) {
            AbstractC73317Y7a.A0J(this.A02, this.A03, this.A07, this.A06, this.A08, c32178EBz.A00);
        }
        Runnable runnable = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-406705105, A032);
        C0f9.A0A(-2012316895, A03);
    }
}

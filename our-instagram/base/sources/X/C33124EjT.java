package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.EjT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33124EjT extends AbstractC32533EUj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33124EjT(Activity activity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Runnable runnable, String str, String str2, String str3, String str4, String str5, boolean z) {
        super(abstractC10360h2);
        this.A00 = activity;
        this.A05 = str;
        this.A01 = interfaceC11380iw;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = runnable;
        this.A02 = userSession;
        this.A04 = str4;
        this.A08 = str5;
        this.A09 = z;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1787228014);
        int A032 = C0f9.A03(-1218366048);
        String str = ((C32178EBz) obj).A00;
        Activity activity = this.A00;
        String str2 = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        String str3 = this.A06;
        String str4 = this.A07;
        Runnable runnable = this.A03;
        Bundle A033 = AbstractC31180DnO.A03(str);
        boolean z = this.A09;
        String str5 = this.A04;
        UserSession userSession = this.A02;
        HashMap A0o = AbstractC31180DnO.A0o(str);
        A0o.put("media_id", str2);
        A0o.put("share_surface", str5);
        AbstractC31510Dsu.A0N(activity, null, A033, interfaceC11380iw, userSession, str4, str3, A0o, false, z);
        runnable.run();
        AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, str2, str5, this.A08, str);
        C0f9.A0A(1608038937, A032);
        C0f9.A0A(1088842919, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1139693721);
        C9GR.A0E(this.A00, "share_location_via_app_failed");
        AbstractC73317Y7a.A0H(this.A01, this.A02, this.A05, this.A04, this.A08, abstractC115105If.A01());
        C0f9.A0A(1528930948, A03);
    }
}

package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ej7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33103Ej7 extends ET4 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ android.net.Uri A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ C75113Zb A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33103Ej7(Context context, Context context2, android.net.Uri uri, AbstractC10360h2 abstractC10360h2, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, Runnable runnable, String str) {
        super(context, abstractC10360h2);
        this.A03 = c38321qM;
        this.A02 = userSession;
        this.A01 = uri;
        this.A00 = context2;
        this.A07 = str;
        this.A04 = interfaceC60442pS;
        this.A05 = c75113Zb;
        this.A06 = runnable;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        String str;
        String str2;
        InterfaceC60442pS interfaceC60442pS;
        int A03 = C0f9.A03(-1008398442);
        int A032 = C0f9.A03(1437357016);
        String str3 = ((EC0) obj).A00;
        Bundle A0b = AbstractC166987dD.A0b();
        C38321qM c38321qM = this.A03;
        UserSession userSession = this.A02;
        A0b.putString("android.intent.extra.TEXT", AbstractC31510Dsu.A01(userSession, c38321qM, str3));
        android.net.Uri uri = this.A01;
        if (uri != null) {
            Context context = this.A00;
            str2 = this.A07;
            interfaceC60442pS = this.A04;
            HashMap A0o = AbstractC31180DnO.A0o(str3);
            AbstractC31181DnP.A0w(userSession, c38321qM, str2, A0o);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(AbstractC43591JPw.A00(222));
            intent.putExtra(MSV.A00(19), uri);
            intent.setFlags(1);
            if (!A0b.isEmpty()) {
                intent.putExtras(A0b);
            }
            if (C12260kU.A0E(context, AbstractC31510Dsu.A00(context, intent, userSession, interfaceC60442pS.getModuleName(), A0o))) {
                "share_to_system_sheet".getClass();
                C19280xC A01 = C19280xC.A01("share_to_system_sheet", null);
                A01.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, MediaStreamTrack.VIDEO_TRACK_KIND);
                AbstractC31173DnH.A1S(A01, userSession);
            } else {
                C0w9.A03("share_to_system_sheet", "Can't find intent handler for content");
            }
        } else {
            C75113Zb c75113Zb = this.A05;
            if (c75113Zb != null) {
                i = c75113Zb.A03;
            } else {
                i = -1;
            }
            if (c38321qM.A1e(i) != null) {
                str = C38801rC.A05(c38321qM.A1e(i).getId());
            } else {
                str = null;
            }
            Context context2 = this.A00;
            str2 = this.A07;
            interfaceC60442pS = this.A04;
            AbstractC31510Dsu.A0O(context2, null, A0b, interfaceC60442pS, userSession, c38321qM, AbstractC31171DnF.A0V(i), str3, str2, str);
        }
        if (!AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36323878452080296L).booleanValue()) {
            AbstractC73317Y7a.A0I(interfaceC60442pS, userSession, null, c38321qM.getId(), str2, "system_share_sheet", str3, null, AbstractC25226BEj.A1G(c38321qM), null, null);
        }
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-554465325, A032);
        C0f9.A0A(-609061953, A03);
    }

    @Override // X.ET4, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-895872617);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        C38321qM c38321qM = this.A03;
        String str = this.A07;
        Throwable A01 = abstractC115105If.A01();
        Runnable runnable = this.A06;
        String id = c38321qM.getId();
        id.getClass();
        AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, id, str, "system_share_sheet", A01);
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(-936891425, A03);
    }
}

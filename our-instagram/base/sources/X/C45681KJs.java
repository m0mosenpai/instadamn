package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collections;

/* renamed from: X.KJs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45681KJs extends AbstractC66422zJ implements InterfaceC165507ad, C7YI, InterfaceC164897Zc, InterfaceC164967Zl, InterfaceC165017Zq, InterfaceC165067Zv, C7Y8, InterfaceC165077Zw, InterfaceC165157a4, InterfaceC165207a9, InterfaceC165247aD, InterfaceC165257aE, InterfaceC165277aG, InterfaceC165287aH, InterfaceC165307aJ, InterfaceC165407aT, InterfaceC165547ah, InterfaceC165637aq, InterfaceC165677au {
    public C47344Kvt A00;
    public AnonymousClass988 A01;
    public C49126Lo5 A02;
    public C161367Kx A03 = new C161367Kx();
    public final C7F8 A04;

    @Override // X.InterfaceC165247aD
    public final C23031Ai CE0() {
        return null;
    }

    @Override // X.InterfaceC165507ad
    public final boolean CQu() {
        return false;
    }

    @Override // X.C7YI
    public final void Cgg(ImageUrl imageUrl, MessagingUser messagingUser) {
    }

    @Override // X.InterfaceC165407aT
    public final void CqX(String str) {
    }

    @Override // X.InterfaceC165277aG
    public final void Cqp(String str) {
    }

    @Override // X.InterfaceC165677au
    public final boolean Cqt(String str) {
        return false;
    }

    @Override // X.InterfaceC165277aG
    public final void Cr1() {
    }

    @Override // X.InterfaceC165287aH
    public final void Cr4(String str) {
    }

    @Override // X.C7YI
    public final void CrK(View view, MessagingUser messagingUser) {
    }

    @Override // X.InterfaceC165157a4
    public final void CrN(String str) {
    }

    @Override // X.InterfaceC165157a4
    public final void CrO(View view, String str, boolean z) {
    }

    @Override // X.C7YI
    public final void Cre(MessagingUser messagingUser, String str) {
    }

    @Override // X.InterfaceC165067Zv
    public final void Cs3(String str, boolean z, String str2) {
    }

    @Override // X.C7Y8
    public final void Cs6(String str, String str2, String str3) {
    }

    @Override // X.InterfaceC165547ah
    public final void CxY() {
    }

    @Override // X.InterfaceC164897Zc
    public final void DJX() {
    }

    @Override // X.InterfaceC165017Zq
    public final void DT8(C2EY c2ey, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
    }

    @Override // X.InterfaceC165637aq
    public final void Dse(String str) {
    }

    @Override // X.InterfaceC165257aE
    public final void Ekd(MessageIdentifier messageIdentifier, InterfaceC1119153d interfaceC1119153d, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // X.InterfaceC164967Zl
    public final void Eku(MessageIdentifier messageIdentifier) {
    }

    @Override // X.InterfaceC165307aJ
    public final void El9(PointF pointF, InterfaceC129525tH interfaceC129525tH, C7QV c7qv, long j, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC165207a9
    public final void ElE(InterfaceC129525tH interfaceC129525tH, EnumC46202Kce enumC46202Kce, MessageIdentifier messageIdentifier) {
    }

    @Override // X.InterfaceC165207a9
    public final void ElF(C160787Im c160787Im, EnumC46202Kce enumC46202Kce) {
    }

    @Override // X.InterfaceC165077Zw
    public final boolean isResumed() {
        return false;
    }

    @Override // X.InterfaceC164897Zc
    public final C161367Kx BfG() {
        return this.A03;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        C45893KSw c45893KSw = (C45893KSw) interfaceC66482zP;
        C44790JsB c44790JsB = (C44790JsB) c3oo;
        this.A02.ADy(c44790JsB, c45893KSw);
        C7BF c7bf = c44790JsB.A03;
        C162247Oj A0G = AbstractC43593JPy.A0G(c7bf.A02);
        if (A0G != null) {
            Object shader = A0G.A01.getPaint().getShader();
            if (shader instanceof InterfaceC161477Li) {
                ((InterfaceC161477Li) shader).Eg1(this.A04.A00());
            }
        }
        ViewGroup viewGroup = c44790JsB.A02;
        LQ1.A00(viewGroup, 28, c45893KSw, this);
        AbstractC46816KnB abstractC46816KnB = AbstractC46816KnB.$redex_init_class;
        int ordinal = c45893KSw.A00.A00.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        i = 2131960155;
                    }
                    AbstractC010103p.A0B(viewGroup, new C44441Jl8(this, 2));
                }
                i = 2131960154;
            } else {
                i = 2131960156;
            }
        } else {
            i = 2131960157;
        }
        AbstractC166997dE.A18(viewGroup.getContext(), viewGroup, i);
        c7bf.A03.setImportantForAccessibility(2);
        AbstractC010103p.A0B(viewGroup, new C44441Jl8(this, 2));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C44790JsB ANU = this.A02.ANU(layoutInflater, viewGroup);
        if (AbstractC167007dF.A1Z(this.A01.A0S)) {
            Context context = viewGroup.getContext();
            C14360o3.A0B(context, 1);
            C44426JkP c44426JkP = new C44426JkP(context);
            c44426JkP.addView(ANU.A02);
            return new C44790JsB(c44426JkP, ANU.A00, ANU.A01, ANU.A03);
        }
        return ANU;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45893KSw.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        this.A02.F91((C44790JsB) c3oo);
    }

    public C45681KJs(Context context, C47344Kvt c47344Kvt, AnonymousClass988 anonymousClass988) {
        this.A01 = anonymousClass988;
        this.A02 = new C49126Lo5(this, this.A01, new C158907Bc(this, anonymousClass988, Collections.emptyList()));
        this.A00 = c47344Kvt;
        this.A04 = new C7F8(context);
    }
}

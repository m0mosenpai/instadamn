package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.3dJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77333dJ extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C38681GzM A00;
    public final /* synthetic */ C76223bS A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C76623c7 A03;
    public final /* synthetic */ C77143d0 A04;
    public final /* synthetic */ C77043cq A05;
    public final /* synthetic */ C76943cg A06;
    public final /* synthetic */ C77243dA A07;
    public final /* synthetic */ InterfaceC76583c3 A08;
    public final /* synthetic */ C76853cX A09;
    public final /* synthetic */ C75113Zb A0A;
    public final /* synthetic */ User A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77333dJ(C38681GzM c38681GzM, C76223bS c76223bS, C51762Yz c51762Yz, C76623c7 c76623c7, C77143d0 c77143d0, C77043cq c77043cq, C76943cg c76943cg, C77243dA c77243dA, InterfaceC76583c3 interfaceC76583c3, C76853cX c76853cX, C75113Zb c75113Zb, User user, boolean z) {
        super(0);
        this.A00 = c38681GzM;
        this.A08 = interfaceC76583c3;
        this.A01 = c76223bS;
        this.A06 = c76943cg;
        this.A05 = c77043cq;
        this.A04 = c77143d0;
        this.A03 = c76623c7;
        this.A0A = c75113Zb;
        this.A02 = c51762Yz;
        this.A07 = c77243dA;
        this.A09 = c76853cX;
        this.A0B = user;
        this.A0C = z;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        SpannableStringBuilder A03;
        C38681GzM c38681GzM = this.A00;
        if (c38681GzM != null) {
            Hashtag hashtag = (Hashtag) c38681GzM.A01;
            A03 = new SpannableStringBuilder();
            if (hashtag != null) {
                A03.append((CharSequence) "#");
                A03.append((CharSequence) hashtag.getName());
                A03.setSpan(new CharacterStyle(), 0, A03.length(), 33);
            }
        } else {
            InterfaceC76583c3 interfaceC76583c3 = this.A08;
            if (C9BV.A00(interfaceC76583c3, 1)) {
                Context A00 = AbstractC77363dM.A00(this.A01);
                UserSession userSession = this.A06.A00;
                C51761Mtk c51761Mtk = (C51761Mtk) ((C9BV) interfaceC76583c3).A01;
                CPA cpa = (CPA) this.A05.A01.getValue();
                int i = this.A04.A09;
                C38321qM c38321qM = this.A03.A01;
                C75113Zb c75113Zb = this.A0A;
                A03 = AbstractC89383ye.A00(A00, c51761Mtk, userSession, c38321qM, cpa, c75113Zb, i, c75113Zb.getPosition());
            } else if (C9BV.A00(interfaceC76583c3, 2)) {
                Context A002 = AbstractC77363dM.A00(this.A01);
                UserSession userSession2 = this.A06.A00;
                C76593c4 c76593c4 = (C76593c4) ((C9BV) interfaceC76583c3).A01;
                A03 = AbstractC89383ye.A01(A002, userSession2, this.A04, (C100584fN) this.A05.A02.getValue(), c76593c4, this.A0A.getPosition());
            } else if (C9BV.A00(interfaceC76583c3, 0)) {
                A03 = ((CWU) this.A05.A09.getValue()).A01(AbstractC77363dM.A00(this.A01), (C25993Beh) ((C9BV) interfaceC76583c3).A02, this.A0A.getPosition(), ((Number) this.A02.A03).intValue());
            } else if (interfaceC76583c3 instanceof C77353dL) {
                C77353dL c77353dL = (C77353dL) interfaceC76583c3;
                C76353bf c76353bf = c77353dL.A01;
                if (c76353bf != null) {
                    User user = this.A0B;
                    C76853cX c76853cX = this.A09;
                    C76223bS c76223bS = this.A01;
                    boolean z = this.A0C;
                    A03 = C76943cg.A03(AbstractC77363dM.A00(c76223bS), this.A04, c76353bf, c76853cX, user, z);
                } else {
                    A03 = (SpannableStringBuilder) ((InterfaceC16590sC) ((C26082BgB) c77353dL.A00.A01).A00).invoke(this.A07, this.A09, Integer.valueOf(this.A0A.A02), this.A06.A02, this.A04);
                }
            } else if (interfaceC76583c3 instanceof C76563c1) {
                C76353bf c76353bf2 = ((C76563c1) interfaceC76583c3).A00;
                User user2 = this.A0B;
                C76853cX c76853cX2 = this.A09;
                A03 = C76943cg.A03(AbstractC77363dM.A00(this.A01), this.A04, c76353bf2, c76853cX2, user2, this.A0C);
            } else {
                throw new RuntimeException();
            }
        }
        C77243dA c77243dA = this.A07;
        if (c77243dA.A01) {
            AbstractC89383ye.A07(AbstractC77363dM.A00(this.A01), A03, this.A04, c77243dA.A00);
        }
        return A03;
    }
}

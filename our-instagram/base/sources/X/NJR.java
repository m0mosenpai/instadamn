package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes9.dex */
public final class NJR extends AbstractC50867Mdy {
    public C52094N2u A00;
    public C51754Mtd A01;
    public C47Z A02;
    public final C07X A03;
    public final C44475Jlh A04;
    public final C44466JlY A05;
    public final C50880MeB A06;
    public final UserSession A07;
    public final C52468NJm A08;
    public final C50991Mfy A09;
    public final C50994Mg1 A0A;
    public final NJM A0B;
    public final C52464NJi A0C;
    public final C52481NJz A0D;
    public final NKJ A0E;
    public final C52471NJp A0F;
    public final NKB A0G;
    public final NK3 A0H;
    public final NK9 A0I;
    public final C52465NJj A0J;
    public final C52472NJq A0K;
    public final NKN A0L;
    public final C52473NJr A0M;
    public final C52457NJb A0N;
    public final NK8 A0O;
    public final C52474NJs A0P;
    public final C52477NJv A0Q;
    public final C52469NJn A0R;
    public final NKO A0S;
    public final NKF A0T;
    public final NK1 A0U;
    public final NKH A0V;
    public final NK0 A0W;
    public final C52475NJt A0X;
    public final NKK A0Y;
    public final C52476NJu A0Z;
    public final NK7 A0a;
    public final NKG A0b;
    public final NK2 A0c;
    public final C52466NJk A0d;
    public final NK4 A0e;
    public final TrialUseCase A0f;
    public final NKC A0g;
    public final NK5 A0h;
    public final NKM A0i;
    public final PendingRecipient A0j;
    public final String A0k;
    public final boolean A0l;
    public final Application A0m;

    public static C128175qm A03(NJR njr) {
        return njr.A0N.A03.A07.A09();
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C8YE c8ye = this.A0I.A01;
        if (c8ye != null) {
            c8ye.A05();
        }
    }

    public static C47Z A04(N6J n6j) {
        return N6J.A06(n6j).A02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJR(Application application, C07X c07x, C44475Jlh c44475Jlh, C44466JlY c44466JlY, C50880MeB c50880MeB, UserSession userSession, C52468NJm c52468NJm, C50991Mfy c50991Mfy, C50994Mg1 c50994Mg1, NJM njm, C52464NJi c52464NJi, C52481NJz c52481NJz, NKJ nkj, C52471NJp c52471NJp, NKB nkb, NK3 nk3, NK9 nk9, C52465NJj c52465NJj, C52472NJq c52472NJq, NKN nkn, C52473NJr c52473NJr, C52457NJb c52457NJb, NK8 nk8, C52474NJs c52474NJs, C52477NJv c52477NJv, C52469NJn c52469NJn, NKO nko, NKF nkf, NK1 nk1, NKH nkh, NK0 nk0, C52475NJt c52475NJt, NKK nkk, C52476NJu c52476NJu, NK7 nk7, NKG nkg, NK2 nk2, C52466NJk c52466NJk, NK4 nk4, TrialUseCase trialUseCase, NKC nkc, NK5 nk5, NKM nkm, PendingRecipient pendingRecipient, String str, boolean z) {
        super(application, njm);
        C14360o3.A0B(userSession, 3);
        AbstractC25234BEr.A0k(4, c07x, c44466JlY, c50991Mfy, c50994Mg1);
        C14360o3.A0B(c50880MeB, 8);
        AbstractC25229BEm.A1J(c44475Jlh, 9, str);
        this.A0m = application;
        this.A0N = c52457NJb;
        this.A07 = userSession;
        this.A03 = c07x;
        this.A05 = c44466JlY;
        this.A09 = c50991Mfy;
        this.A0A = c50994Mg1;
        this.A06 = c50880MeB;
        this.A04 = c44475Jlh;
        this.A0k = str;
        this.A0l = z;
        this.A0j = pendingRecipient;
        this.A0B = njm;
        this.A08 = c52468NJm;
        this.A0L = nkn;
        this.A0I = nk9;
        this.A0J = c52465NJj;
        this.A0U = nk1;
        this.A0S = nko;
        this.A0E = nkj;
        this.A0V = nkh;
        this.A0H = nk3;
        this.A0O = nk8;
        this.A0c = nk2;
        this.A0X = c52475NJt;
        this.A0a = nk7;
        this.A0i = nkm;
        this.A0h = nk5;
        this.A0P = c52474NJs;
        this.A0C = c52464NJi;
        this.A0g = nkc;
        this.A0D = c52481NJz;
        this.A0d = c52466NJk;
        this.A0e = nk4;
        this.A0T = nkf;
        this.A0Y = nkk;
        this.A0M = c52473NJr;
        this.A0F = c52471NJp;
        this.A0G = nkb;
        this.A0f = trialUseCase;
        this.A0b = nkg;
        this.A0W = nk0;
        this.A0Q = c52477NJv;
        this.A0R = c52469NJn;
        this.A0Z = c52476NJu;
        this.A0K = c52472NJq;
        AnonymousClass191 A01 = PZT.A01(this, AbstractC141776au.A00(this), 37);
        C2GS c2gs = this.A05.A00;
        C07X c07x2 = this.A03;
        AbstractC31174DnI.A1E(c07x2, c2gs, new C57749Pjc(this, 14), 3);
        AbstractC31174DnI.A1E(c07x2, this.A09.A00, new C57749Pjc(this, 15), 3);
        C50994Mg1 c50994Mg12 = this.A0A;
        AbstractC31174DnI.A1E(c07x2, c50994Mg12.A0A, new C57749Pjc(this, 16), 3);
        AbstractC31174DnI.A1E(c07x2, c50994Mg12.A09, new C57749Pjc(this, 17), 3);
        AbstractC31174DnI.A1E(c07x2, this.A06.A00, new C57749Pjc(this, 18), 3);
        PZT.A02(this, A01, AbstractC141776au.A00(this), 36);
    }
}

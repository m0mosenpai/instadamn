package com.instagram.appreciation.gifting;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC46604Kjh;
import X.B4Z;
import X.C0eB;
import X.C194848jk;
import X.C1JX;
import X.C27S;
import X.C27V;
import X.C3KD;
import X.C3NX;
import X.C3NY;
import X.C41451vu;
import X.C45114Jxj;
import X.C45125Jxu;
import X.EnumC46198Kca;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.JQ1;
import X.LJ7;
import android.text.SpannableStringBuilder;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource;
import com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.appreciation.gifting.AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1", f = "AppreciationGiftingBottomSheetFragment.kt", i = {0, 0, 0, 0}, l = {655}, m = "invokeSuspend", n = {"logger", "viewName", "bugReporter", "errorSnackBarEvent"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
public final class AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ C45125Jxu A07;
    public final /* synthetic */ UserSession A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ List A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1(C45125Jxu c45125Jxu, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A08 = userSession;
        this.A0G = str;
        this.A0D = str2;
        this.A09 = str3;
        this.A0B = str4;
        this.A0E = str5;
        this.A0A = str6;
        this.A0C = str7;
        this.A06 = i;
        this.A07 = c45125Jxu;
        this.A05 = i2;
        this.A0H = list;
        this.A0F = str8;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        UserSession userSession = this.A08;
        String str = this.A0G;
        String str2 = this.A0D;
        String str3 = this.A09;
        String str4 = this.A0B;
        String str5 = this.A0E;
        String str6 = this.A0A;
        String str7 = this.A0C;
        int i = this.A06;
        C45125Jxu c45125Jxu = this.A07;
        int i2 = this.A05;
        return new AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1(c45125Jxu, userSession, str, str2, str3, str4, str5, str6, str7, this.A0F, this.A0H, interfaceC23621Ds, i, i2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.Kjq, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        LJ7 lj7;
        EnumC46198Kca enumC46198Kca;
        C27V A00;
        C3KD A002;
        int i;
        List list;
        String str;
        LJ7 lj72;
        EnumC46198Kca enumC46198Kca2;
        String str2;
        String str3;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            A002 = (C3KD) this.A04;
            A00 = (C27V) this.A03;
            enumC46198Kca = (EnumC46198Kca) this.A02;
            lj7 = (LJ7) this.A01;
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            UserSession userSession = this.A08;
            String str4 = this.A0G;
            String str5 = this.A0D;
            lj7 = new LJ7(new LoggingFanData(str4, str5, this.A09, this.A0B), AbstractC31171DnF.A0D("appreciation_gifting"), userSession);
            enumC46198Kca = EnumC46198Kca.A07;
            A00 = C27S.A00().A00(userSession);
            AppreciationGiftingRepository appreciationGiftingRepository = new AppreciationGiftingRepository(new AppreciationGiftingDataSource(userSession), new Object(), str4, this.A0E);
            String str6 = this.A0A;
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(this.A0C);
            JQ1.A0U(A0H, str6, this.A06);
            C45125Jxu c45125Jxu = this.A07;
            A002 = AbstractC46604Kjh.A00((ImageUrl) c45125Jxu.A04, A0H);
            String str7 = ((C45114Jxj) c45125Jxu.A01).A05;
            lj7.A03(enumC46198Kca, str7, this.A0H, this.A05);
            this.A01 = lj7;
            this.A02 = enumC46198Kca;
            this.A03 = A00;
            this.A04 = A002;
            this.A00 = 1;
            obj2 = appreciationGiftingRepository.A00.A00(str7, str5, appreciationGiftingRepository.A02, appreciationGiftingRepository.A03, this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        C3NY c3ny = (C3NY) obj2;
        if (c3ny instanceof C3NX) {
            if (AbstractC166987dD.A1a(((C3NX) c3ny).A00)) {
                String str8 = this.A0A;
                SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(this.A0F);
                JQ1.A0U(A0H2, str8, this.A06);
                C41451vu c41451vu = C41451vu.A01;
                C45125Jxu c45125Jxu2 = this.A07;
                c41451vu.E4s(AbstractC46604Kjh.A00((ImageUrl) c45125Jxu2.A04, A0H2));
                lj7.A04(enumC46198Kca, ((C45114Jxj) c45125Jxu2.A01).A05, this.A0H, this.A05);
                return C0eB.A00;
            }
            String str9 = this.A08.userId;
            String str10 = this.A09;
            String str11 = this.A0G;
            String str12 = this.A0E;
            String str13 = this.A0D;
            String str14 = ((C45114Jxj) this.A07.A01).A05;
            i = this.A05;
            A00.A01("Result is success but the server return false", str9, str10, str11, str12, str13, str14, i);
            list = this.A0H;
            str3 = null;
            str = "spending_gift_result_failure";
            lj72 = lj7;
            enumC46198Kca2 = enumC46198Kca;
            str2 = str14;
        } else if (c3ny instanceof C194848jk) {
            String str15 = (String) ((C194848jk) c3ny).A00;
            String str16 = this.A08.userId;
            String str17 = this.A09;
            String str18 = this.A0G;
            String str19 = this.A0E;
            String str20 = this.A0D;
            String str21 = ((C45114Jxj) this.A07.A01).A05;
            i = this.A05;
            A00.A01(str15, str16, str17, str18, str19, str20, str21, i);
            list = this.A0H;
            str = "spending_gift_network_failure";
            lj72 = lj7;
            enumC46198Kca2 = enumC46198Kca;
            str2 = str21;
            str3 = str15;
        } else {
            throw B4Z.A00();
        }
        lj72.A02(enumC46198Kca2, str2, str, str3, list, i);
        C41451vu.A01.E4s(A002);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppreciationGiftingBottomSheetFragment$doOptimisticGifting$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}

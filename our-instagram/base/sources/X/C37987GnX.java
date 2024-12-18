package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.GnX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37987GnX implements InterfaceC60602pj {
    public C189478aR A00;
    public C41628IbJ A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Activity A06;
    public final AbstractC018607g A07;
    public final InterfaceC11380iw A08;
    public final C25671My A09;
    public final UserSession A0A;
    public final JIC A0B;
    public final InterfaceC41501vz A0C;

    public C37987GnX(Activity activity, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JIC jic) {
        C14360o3.A0B(userSession, 5);
        this.A06 = activity;
        this.A08 = interfaceC11380iw;
        this.A07 = abstractC018607g;
        this.A0A = userSession;
        this.A0B = jic;
        this.A09 = AbstractC25651Mw.A00(userSession);
        this.A0C = C37816GkW.A00(this, 54);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.fragment.app.Fragment, X.HCd, X.2oe] */
    public final void A00(int i) {
        this.A0B.CJ4(i);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("starting_position", i);
        UserSession userSession = this.A0A;
        AbstractC31173DnH.A1C(A0b, userSession);
        ?? abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.setArguments(A0b);
        abstractC59962oe.A04 = this;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, false);
        Activity activity = this.A06;
        A0y.A0F = ViewConfiguration.get(activity).getScaledPagingTouchSlop();
        A0y.A0X = new C46045KZt(this, 2);
        this.A00 = A0y.A00().A02(activity, abstractC59962oe);
    }

    public final void A01(C41628IbJ c41628IbJ) {
        QuestionResponseType Bol;
        VG2 vg2;
        String str;
        this.A01 = c41628IbJ;
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            this.A05 = true;
            c189478aR.A0L(null);
            return;
        }
        if (c41628IbJ == null || (Bol = c41628IbJ.A00.Bol()) == null) {
            return;
        }
        int ordinal = Bol.ordinal();
        if (ordinal != 2) {
            if (ordinal != 4) {
                return;
            }
            vg2 = VG2.A0l;
            str = c41628IbJ.A00.getId();
        } else {
            vg2 = VG2.A0d;
            QuestionMediaResponseModelIntf BRR = c41628IbJ.A00.BRR();
            if (BRR != null) {
                str = BRR.getId();
            } else {
                str = null;
            }
        }
        UserSession userSession = this.A0A;
        Activity activity = this.A06;
        InterfaceC11380iw interfaceC11380iw = this.A08;
        if (str == null) {
            str = "";
        }
        WEz A01 = AbstractC69993VzD.A01(activity, interfaceC11380iw, userSession, EnumC65855TvH.A1D, vg2, str);
        A01.A01 = C41628IbJ.A00(c41628IbJ);
        A01.A08(new C39450Hbc(2));
        WEz.A00(null, A01);
    }

    public final void A02(C41628IbJ c41628IbJ) {
        String str;
        String str2;
        String str3;
        QuestionResponseType questionResponseType;
        String str4;
        String str5;
        QuestionResponseModelIntf questionResponseModelIntf;
        QuestionResponseModelIntf questionResponseModelIntf2;
        User A00;
        this.A01 = c41628IbJ;
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            this.A03 = true;
            c189478aR.A0L(null);
            return;
        }
        C28501Zl c28501Zl = C28531Zo.A04.A02;
        UserSession userSession = this.A0A;
        C34725FRo A06 = c28501Zl.A06(this.A08, userSession, "reel_dashboard_viewer");
        JIC jic = this.A0B;
        C41181vS Aum = jic.Aum();
        String str6 = null;
        if (Aum != null) {
            str = Aum.A0k;
        } else {
            str = null;
        }
        if (str != null) {
            A06.A03(str);
            C41181vS Aum2 = jic.Aum();
            if (Aum2 != null && (str2 = Aum2.A0j) != null) {
                A06.A04(str2);
                if (c41628IbJ != null && (A00 = C41628IbJ.A00(c41628IbJ)) != null) {
                    str3 = A00.getId();
                } else {
                    str3 = null;
                }
                A06.A06(str3);
                if (c41628IbJ != null && (questionResponseModelIntf2 = c41628IbJ.A00) != null) {
                    questionResponseType = questionResponseModelIntf2.Bol();
                } else {
                    questionResponseType = null;
                }
                if (questionResponseType != QuestionResponseType.A06 && C18U.A06(C06090Tz.A05, userSession, 36314794596240187L)) {
                    if (c41628IbJ == null || (questionResponseModelIntf = c41628IbJ.A00) == null || (str4 = questionResponseModelIntf.Bog()) == null) {
                        str4 = "";
                    }
                    Bundle bundle = A06.A01;
                    bundle.putString(AbstractC111324zv.A00(307), str4);
                    A06.A05(AbstractC167007dF.A0f(this.A06, str4, 2131971250));
                    if (c41628IbJ != null) {
                        str5 = c41628IbJ.A00.getId();
                    } else {
                        str5 = null;
                    }
                    A06.A07(str5, EnumC75383a5.A14.A00);
                    if (questionResponseType != null) {
                        str6 = questionResponseType.A00;
                    }
                    C14360o3.A0B(str6, 0);
                    bundle.putString(AbstractC111324zv.A00(1581), str6);
                    A06.A01(AbstractC111324zv.A00(3168));
                }
                C3DN A002 = C3DN.A00.A00(this.A06);
                if (A002 == null) {
                    return;
                }
                A002.A0K(A06.A00());
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A03(C41628IbJ c41628IbJ) {
        QuestionStickerType questionStickerType;
        String A00;
        String str;
        boolean z;
        ExtendedImageUrl A002;
        String str2;
        this.A01 = c41628IbJ;
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            this.A04 = true;
            c189478aR.A0L(null);
            return;
        }
        Activity activity = this.A06;
        float A0A = AbstractC13880nE.A0A(activity);
        float A09 = AbstractC13880nE.A09(activity);
        RectF rectF = new RectF(0.0f, 0.0f, A0A, A09);
        rectF.offsetTo(0.0f, A09);
        C41628IbJ c41628IbJ2 = this.A01;
        if (c41628IbJ2 != null) {
            questionStickerType = c41628IbJ2.A01.Bjf();
        } else {
            questionStickerType = null;
        }
        QuestionStickerType questionStickerType2 = QuestionStickerType.A07;
        UserSession userSession = this.A0A;
        if (questionStickerType == questionStickerType2) {
            C41628IbJ c41628IbJ3 = this.A01;
            if (c41628IbJ3 != null) {
                QuestionMediaResponseModelIntf BRR = c41628IbJ3.A00.BRR();
                if (BRR == null || BRR.getId() == null) {
                    return;
                }
                if ((BRR.BGx() == null && BRR.CFe() == null) || BRR.Ba2() == null || BRR.BZo() == null) {
                    return;
                }
                Bundle A0b = AbstractC166987dD.A0b();
                if (BRR.BRq() != null && BRR.BRq().intValue() != 1) {
                    z = true;
                    ArrayList A003 = AbstractC75353a2.A00(BRR.CFe());
                    if (A003 == null) {
                        return;
                    }
                    String id = BRR.getId();
                    C14360o3.A0B(id, 0);
                    VideoUrlImpl A01 = AbstractC88593xJ.A01(id, A003);
                    if (A01 == null) {
                        return;
                    } else {
                        str2 = A01.A06;
                    }
                } else {
                    z = false;
                    if (BRR.BGx() == null || (A002 = AbstractC41341IRm.A00(activity, BRR.BGx(), BRR.Ba2().intValue(), BRR.BZo().intValue())) == null) {
                        return;
                    } else {
                        str2 = A002.A0A;
                    }
                }
                if (str2 == null) {
                    return;
                }
                C121275eQ A03 = AbstractC50633MWu.A03(activity, userSession, new OUQ(str2, AbstractC111324zv.A00(2873), z, false, false));
                A03.A00 = new HJ1(1, activity, A0b, userSession, c41628IbJ3, z);
                C1GJ.A06(A03, -5, 3, false, false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        C41628IbJ c41628IbJ4 = this.A01;
        if (c41628IbJ4 != null) {
            Bundle A0b2 = AbstractC166987dD.A0b();
            A0b2.putParcelable(AbstractC111324zv.A00(1772), rectF);
            QuestionResponsesModelIntf questionResponsesModelIntf = c41628IbJ4.A01;
            A0b2.putString(AbstractC111324zv.A00(1775), questionResponsesModelIntf.getQuestion());
            A0b2.putString(AbstractC111324zv.A00(1778), c41628IbJ4.A00.Bol().A00);
            if (c41628IbJ4.A00.Bol() == QuestionResponseType.A06 && c41628IbJ4.A00.BVk() != null) {
                try {
                    String A004 = AbstractC111324zv.A00(1774);
                    MusicQuestionResponseModel F70 = c41628IbJ4.A00.BVk().F70(C1DS.A00(userSession));
                    StringWriter A0O = AbstractC37300Gc1.A0O();
                    C17z A0A2 = AbstractC221915u.A00.A0A(A0O);
                    AbstractC41338IRj.A00(A0A2, F70);
                    A0A2.close();
                    A0b2.putString(A004, A0O.toString());
                } catch (IOException unused) {
                    A00 = AbstractC111324zv.A00(1722);
                    str = AbstractC111324zv.A00(1832);
                    C0w9.A03(A00, str);
                    return;
                }
            } else if (c41628IbJ4.A00.Bol() == QuestionResponseType.A05 && c41628IbJ4.A00.BRR() != null) {
                try {
                    String A005 = AbstractC111324zv.A00(1773);
                    QuestionMediaResponseModel F74 = c41628IbJ4.A00.BRR().F74();
                    StringWriter A0O2 = AbstractC37300Gc1.A0O();
                    C17z A0A3 = AbstractC221915u.A00.A0A(A0O2);
                    AbstractC41340IRl.A00(A0A3, F74);
                    A0A3.close();
                    A0b2.putString(A005, A0O2.toString());
                } catch (IOException unused2) {
                    A00 = AbstractC111324zv.A00(1721);
                    str = "Unable to serialize question media response";
                    C0w9.A03(A00, str);
                    return;
                }
            } else {
                A0b2.putString(AbstractC111324zv.A00(1780), c41628IbJ4.A02());
            }
            A0b2.putString(AbstractC111324zv.A00(1776), questionResponsesModelIntf.BjV());
            A0b2.putString(AbstractC111324zv.A00(1777), c41628IbJ4.A00.getId());
            A0b2.putInt(AbstractC111324zv.A00(1770), c41628IbJ4.A01());
            A0b2.putSerializable(AbstractC111324zv.A00(1771), C22P.A4A);
            A0b2.putString(AbstractC111324zv.A00(1779), C41628IbJ.A00(c41628IbJ4).getId());
            C6XJ.A02(activity, A0b2, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5188)).A0C(activity);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
        this.A09.A01(this.A0C, C23608Ad3.class);
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        this.A09.A02(this.A0C, C23608Ad3.class);
    }
}

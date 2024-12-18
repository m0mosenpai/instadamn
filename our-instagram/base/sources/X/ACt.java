package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeStickerClientModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ACt {
    public static void A04(C88Y c88y, Iterator it) {
        C09530e4 c09530e4 = (C09530e4) it.next();
        Drawable drawable = (Drawable) c09530e4.A00;
        C8FC c8fc = (C8FC) c09530e4.A01;
        if (c88y != null) {
            c88y.A0C(drawable, c8fc, false);
        }
    }

    public final int A05() {
        List list;
        if (this instanceof C218089kg) {
            list = ((C218089kg) this).A04;
        } else if (this instanceof C218049kc) {
            list = ((C218049kc) this).A04;
        } else if (this instanceof C218059kd) {
            list = ((C218059kd) this).A06;
        } else if (this instanceof C218119kj) {
            list = ((C218119kj) this).A01;
        } else {
            return 0;
        }
        return list.size();
    }

    public final void A06() {
        C88Y c88y;
        C148276lx c148276lx;
        Drawable drawable;
        if (this instanceof C218089kg) {
            ((C218089kg) this).A0A();
            return;
        }
        if (this instanceof C217989kW) {
            C217989kW c217989kW = (C217989kW) this;
            c88y = c217989kW.A00;
            if (c88y == null) {
                return;
            }
            c148276lx = C148276lx.A1Y;
            drawable = c217989kW.A01;
        } else {
            if (this instanceof C217999kX) {
                C217999kX c217999kX = (C217999kX) this;
                C88Y c88y2 = c217999kX.A04;
                if (c88y2 != null) {
                    c88y2.A0A(null, C5GJ.CREATE_MODE_DIAL_SELECTION, null);
                }
                List<SuperlativeStickerClientModel> list = c217999kX.A05;
                C14360o3.A0A(list);
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (SuperlativeStickerClientModel superlativeStickerClientModel : list) {
                    EnumC46183KcL enumC46183KcL = superlativeStickerClientModel.A00;
                    Medium A03 = C8IU.A03(AbstractC166987dD.A11(superlativeStickerClientModel.A01), 3, 0);
                    TargetViewSizeProvider targetViewSizeProvider = c217999kX.A03;
                    InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
                    C195868lW c195868lW = new C195868lW(A03, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), 0);
                    Bitmap decodeFile = BitmapFactory.decodeFile(superlativeStickerClientModel.A02);
                    C14360o3.A07(decodeFile);
                    Context context = c217999kX.A00;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(AbstractC166997dE.A0M(context), decodeFile);
                    if (c88y2 != null) {
                        C148276lx c148276lx2 = C148276lx.A1W;
                        C5GJ c5gj = C5GJ.CREATE_MODE_DIAL_SELECTION;
                        C89F c89f = c217999kX.A02;
                        C89F c89f2 = null;
                        Integer num = C05F.A00;
                        C183748Cz c183748Cz = new C183748Cz(0.0f, 0.0f);
                        if (c89f != null) {
                            c89f2 = c89f;
                        }
                        c88y2.A0B(bitmapDrawable, c5gj, c148276lx2, new C8FC((C8D0) c183748Cz, (C8FD) null, (C89G) c89f2, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, 1.05f, -1.0f, -1.0f, -3, false, false, false, false, false, false, true, true, true, true, true, true, false, false), false, true);
                    }
                    Bitmap bitmap = bitmapDrawable.getBitmap();
                    C14360o3.A07(bitmap);
                    List list2 = superlativeStickerClientModel.A03;
                    UserSession userSession = c217999kX.A01;
                    Iterator it = ALu.A02(context, userSession, list2, 1.0f).iterator();
                    while (it.hasNext()) {
                        A04(c88y2, it);
                    }
                    Iterator it2 = C218949m4.A0C.A03(context, userSession, targetViewSizeProvider, enumC46183KcL).iterator();
                    while (it2.hasNext()) {
                        A04(c88y2, it2);
                    }
                    Iterator it3 = ALu.A01(context, userSession, targetViewSizeProvider, superlativeStickerClientModel.A04).iterator();
                    while (it3.hasNext()) {
                        A04(c88y2, it3);
                    }
                    C14360o3.A0A(c88y2);
                    C199008r1 A032 = c88y2.A03(c195868lW, AbstractC47875LCv.A01(enumC46183KcL));
                    C14360o3.A07(A032);
                    AA0 aa0 = new AA0(A032, AbstractC47875LCv.A01(enumC46183KcL));
                    aa0.A04 = c195868lW;
                    aa0.A01 = bitmap;
                    A0q.add(aa0);
                }
                if (c88y2 == null) {
                    return;
                }
                c88y2.A0G(c88y2.A00.A01.A01.A08(), A0q);
                return;
            }
            if (this instanceof C218109ki) {
                C218109ki c218109ki = (C218109ki) this;
                C88Y c88y3 = c218109ki.A0B;
                C88E c88e = c88y3.A00;
                c88e.A01.A05.A02.A01.A0A = null;
                Context context2 = c218109ki.A07;
                c88y3.A0F(new BackgroundGradientColors(context2.getColor(R.color.purple_4), context2.getColor(R.color.blue_4)));
                c88y3.A0A(null, C5GJ.CREATE_MODE_DIAL_SELECTION, null);
                A8Z A00 = C218109ki.A00(c218109ki);
                c88y3.A0K(A00.A01, null);
                c88y3.A0I("@");
                c88y3.A0D(c218109ki.A0C, context2.getResources().getDimensionPixelOffset(R.dimen.action_bar_immersive_gradient_height));
                C218109ki.A01(c218109ki, A00);
                C88T.A00(c88e.A0F.A09).addTextChangedListener(c218109ki.A08);
                return;
            }
            if (this instanceof C218099kh) {
                C218099kh c218099kh = (C218099kh) this;
                C88Y c88y4 = c218099kh.A0B;
                Context context3 = c218099kh.A07;
                c88y4.A0F(new BackgroundGradientColors(context3.getColor(R.color.purple_4), context3.getColor(R.color.blue_4)));
                c88y4.A0A(null, C5GJ.CREATE_MODE_DIAL_SELECTION, null);
                if (c218099kh.A06) {
                    return;
                }
                c88y4.A04();
                c218099kh.A06 = true;
                ABX abx = c218099kh.A0C;
                String str = abx.A01;
                if (str != null && abx.A03.A0M(str) != null) {
                    C218099kh.A02(c218099kh);
                    return;
                }
                C1ON A002 = AbstractC226429yz.A00(c218099kh.A08);
                A002.A00 = new C207879Ht(c218099kh, 7);
                C1GJ.A03(A002);
                return;
            }
            if (this instanceof C218079kf) {
                C218079kf c218079kf = (C218079kf) this;
                C88Y c88y5 = c218079kf.A08;
                c88y5.A04();
                c88y5.A0A(null, C5GJ.CREATE_MODE_DIAL_SELECTION, null);
                C6C0.A01(new C207879Ht(c218079kf, 6), c218079kf.A05, "birthday_sticker_id");
                return;
            }
            if (this instanceof C218019kZ) {
                C218019kZ.A00(C5GJ.CREATE_MODE_DIAL_SELECTION, (C218019kZ) this);
                return;
            }
            if (this instanceof C217959kT) {
                return;
            }
            if (this instanceof C218029ka) {
                C218029ka.A00(C5GJ.CREATE_MODE_DIAL_SELECTION, (C218029ka) this);
                return;
            }
            if (this instanceof C218039kb) {
                C218039kb.A00(C5GJ.CREATE_MODE_DIAL_SELECTION, (C218039kb) this);
                return;
            }
            if (this instanceof C218049kc) {
                C218049kc c218049kc = (C218049kc) this;
                c218049kc.A09.A0E(C88Z.A0S, null);
                C218049kc.A00(C5GJ.CREATE_MODE_DIAL_SELECTION, c218049kc, c218049kc.A00);
                return;
            }
            if (this instanceof C218059kd) {
                C218059kd c218059kd = (C218059kd) this;
                c218059kd.A0A.A0E(C88Z.A0R, null);
                C218059kd.A00(C5GJ.CREATE_MODE_DIAL_SELECTION, c218059kd);
                return;
            }
            if (this instanceof C218069ke) {
                C218069ke c218069ke = (C218069ke) this;
                C50745Maz c50745Maz = c218069ke.A0D;
                if (c50745Maz.A04) {
                    c50745Maz.A04 = false;
                    c50745Maz.invalidateSelf();
                }
                C88Y c88y6 = c218069ke.A0E;
                c88y6.A09(c50745Maz);
                c88y6.A0A(null, C5GJ.CREATE_MODE_DIAL_SELECTION, null);
                String str2 = c218069ke.A03;
                Context context4 = c218069ke.A09;
                c88y6.A0K(str2, context4.getString(2131973014));
                c218069ke.A04 = true;
                c218069ke.A06 = true;
                c88y6.A0D(c218069ke.A0G, c218069ke.A08);
                String str3 = c218069ke.A00;
                if (str3 == null) {
                    return;
                }
                C224149uy c224149uy = c218069ke.A0F;
                UserSession userSession2 = c218069ke.A0C;
                C7UR c7ur = C7UR.A0A;
                C7US.A00(context4).A05(new C23932AjR(context4, userSession2, c224149uy, str3), str3);
                return;
            }
            if (this instanceof C218009kY) {
                C218009kY c218009kY = (C218009kY) this;
                AlB alB = c218009kY.A0C;
                if (alB != null) {
                    Context context5 = c218009kY.A05;
                    UserSession userSession3 = c218009kY.A08;
                    C202438xN c202438xN = new C202438xN(context5, userSession3, alB);
                    C88Y c88y7 = c218009kY.A09;
                    C14360o3.A0A(c88y7);
                    c88y7.A0A(c202438xN, C5GJ.CREATE_MODE_RANDOM_SELECTION, C148276lx.A0q);
                    if (!c218009kY.A03) {
                        AbstractC55215Oed.A03(c218009kY.A07, userSession3, alB.A00.A09);
                    }
                } else {
                    C88Y c88y8 = c218009kY.A09;
                    C14360o3.A0A(c88y8);
                    c88y8.A0A(c218009kY.A0D, C5GJ.CREATE_MODE_DIAL_SELECTION, C148276lx.A0q);
                }
                c218009kY.A03 = true;
                return;
            }
            if (this instanceof C217979kV) {
                C217979kV c217979kV = (C217979kV) this;
                int[] iArr = C6QG.A0A;
                int i = iArr[0];
                int i2 = iArr[4];
                c88y = c217979kV.A01;
                AM2 am2 = c88y.A00.A01.A07.A00().A0B;
                am2.getClass();
                C8DV c8dv = am2.A01;
                if (c8dv == null) {
                    AbstractC12120kG.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null in prependAndSelectBackgroundGradientColours");
                } else {
                    c8dv.A02(i, i2);
                    AM2.A02(am2, false);
                    AM2.A01(am2, false);
                }
                c148276lx = C148276lx.A1g;
                drawable = c217979kV.A00;
            } else {
                if (!(this instanceof C218119kj)) {
                    return;
                }
                C218119kj c218119kj = (C218119kj) this;
                int size = c218119kj.A00 % c218119kj.A01.size();
                c218119kj.A00 = size;
                C218119kj.A00(C5GJ.CREATE_MODE_DIAL_SELECTION, c218119kj, (AlC) c218119kj.A01.get(size));
                return;
            }
        }
        c88y.A0A(drawable, C5GJ.CREATE_MODE_DIAL_SELECTION, c148276lx);
    }

    public final void A07(C1810281e c1810281e) {
        if (this instanceof C218109ki) {
            c1810281e.A04(new Object());
            ((C218109ki) this).A0B.A07();
        } else {
            if (!(this instanceof C218069ke)) {
                return;
            }
            C218069ke c218069ke = (C218069ke) this;
            c1810281e.A04(new Object());
            C88Y c88y = c218069ke.A0E;
            c88y.A07();
            String str = c218069ke.A01;
            if (str == null) {
                return;
            }
            c88y.A0J(str);
        }
    }

    public final void A08(boolean z) {
        C88Y c88y;
        C88Y c88y2;
        C88Y c88y3;
        if (this instanceof C218059kd) {
            C218059kd c218059kd = (C218059kd) this;
            if (!z) {
                c88y = c218059kd.A0A;
            } else {
                return;
            }
        } else {
            if (this instanceof C217999kX) {
                C217999kX c217999kX = (C217999kX) this;
                if (!z && (c88y3 = c217999kX.A04) != null) {
                    c88y3.A0F(null);
                }
                c88y2 = c217999kX.A04;
                if (c88y2 == null) {
                    return;
                }
            } else {
                if (this instanceof C218109ki) {
                    C218109ki c218109ki = (C218109ki) this;
                    if (!z) {
                        c218109ki.A0B.A0F(null);
                    }
                    c218109ki.A03 = null;
                    c218109ki.A06 = false;
                    C88Y c88y4 = c218109ki.A0B;
                    C88T.A00(c88y4.A00.A0F.A09).removeTextChangedListener(c218109ki.A08);
                    c218109ki.A04.clear();
                    c88y4.A06();
                    c88y4.A0H(null);
                    c88y4.A0I(null);
                    return;
                }
                if (this instanceof C218099kh) {
                    C218099kh c218099kh = (C218099kh) this;
                    if (!z) {
                        c218099kh.A0B.A0F(null);
                    }
                    c218099kh.A03.clear();
                    c88y2 = c218099kh.A0B;
                } else if (this instanceof C218079kf) {
                    C218079kf c218079kf = (C218079kf) this;
                    if (!z) {
                        c218079kf.A08.A0F(null);
                    }
                    c218079kf.A01.clear();
                    c88y2 = c218079kf.A08;
                } else if (this instanceof C218049kc) {
                    C218049kc c218049kc = (C218049kc) this;
                    if (z) {
                        return;
                    } else {
                        c88y = c218049kc.A09;
                    }
                } else {
                    if (this instanceof C218069ke) {
                        C218069ke c218069ke = (C218069ke) this;
                        C50745Maz c50745Maz = c218069ke.A0D;
                        if (!c50745Maz.A04) {
                            c50745Maz.A04 = true;
                        }
                        c218069ke.A05 = false;
                        c218069ke.A02 = "";
                        c218069ke.A01 = null;
                        c218069ke.A04 = false;
                        c218069ke.A0B.removeCallbacks(c218069ke.A0I);
                        C88Y c88y5 = c218069ke.A0E;
                        c88y5.A0D(null, 0);
                        c88y5.A09(null);
                        c88y5.A06();
                        UGe uGe = c218069ke.A0G;
                        uGe.A05.clear();
                        uGe.A06.clear();
                        uGe.A01 = null;
                        uGe.notifyDataSetChanged();
                        return;
                    }
                    if (!(this instanceof C217979kV)) {
                        return;
                    }
                    C217979kV c217979kV = (C217979kV) this;
                    if (z) {
                        return;
                    } else {
                        c88y = c217979kV.A01;
                    }
                }
            }
            c88y2.A06();
            return;
        }
        c88y.A0F(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ACt.A09():boolean");
    }
}

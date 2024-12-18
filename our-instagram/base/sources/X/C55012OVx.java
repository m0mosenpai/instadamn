package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.bannertoast.BannerToast;

/* renamed from: X.OVx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55012OVx {
    public int A00;
    public long A01;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C147716kw A07;
    public Integer A03 = C05F.A00;
    public EnumC109104va A02 = EnumC109104va.A0E;

    public static final void A00(C55012OVx c55012OVx) {
        Integer num;
        String str;
        if (c55012OVx.A06) {
            num = C05F.A0N;
        } else if (c55012OVx.A00 >= 5) {
            num = C05F.A01;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = c55012OVx.A01;
            if (elapsedRealtime - j < 1000) {
                c55012OVx.A05 = false;
                num = C05F.A15;
            } else if (j != 0 && c55012OVx.A02 == EnumC109104va.A07) {
                num = C05F.A0C;
            } else if (c55012OVx.A05) {
                num = C05F.A0j;
            } else {
                num = C05F.A00;
            }
        }
        if (c55012OVx.A03 != num) {
            c55012OVx.A03 = num;
            C147716kw c147716kw = c55012OVx.A07;
            C138376Ot c138376Ot = c147716kw.A01;
            if (c138376Ot != null) {
                switch (num.intValue()) {
                    case 0:
                        AbstractC50547MTc.A02(c138376Ot);
                        break;
                    case 1:
                        c147716kw.A0R.A00(c138376Ot.A02, c138376Ot, "error");
                        c138376Ot.A03(false);
                        AbstractC50547MTc.A03(c138376Ot, AbstractC53242c7.A0H(c138376Ot.A0V.getContext(), R.attr.igds_color_dimmer), true);
                        c138376Ot.A0Q.setVisibility(0);
                        c138376Ot.A0R.setVisibility(0);
                        C50549MTg c50549MTg = c138376Ot.A0e;
                        c50549MTg.A01.setVisibility(0);
                        InterfaceC09390do interfaceC09390do = c50549MTg.A05;
                        AbstractC167017dG.A1W(interfaceC09390do, 0);
                        AbstractC37302Gc3.A06(interfaceC09390do).setText(2131965614);
                        InterfaceC09390do interfaceC09390do2 = c50549MTg.A04;
                        AbstractC167017dG.A1W(interfaceC09390do2, 0);
                        AbstractC37302Gc3.A06(interfaceC09390do2).setText(2131965613);
                        AbstractC167007dF.A0L(c50549MTg.A02).setVisibility(8);
                        ((O4H) c50549MTg.A07.getValue()).A00.setVisibility(8);
                        C147716kw.A01(c147716kw);
                        C147716kw.A02(c147716kw);
                        break;
                    case 2:
                        if (C147716kw.A04(c147716kw) && c147716kw.A0F) {
                            AbstractC50547MTc.A03(c138376Ot, R.color.fds_transparent, false);
                            c138376Ot.A03(true);
                            C50549MTg c50549MTg2 = c138376Ot.A0e;
                            InterfaceC09390do interfaceC09390do3 = c50549MTg2.A03;
                            if (!MSZ.A1Y(interfaceC09390do3)) {
                                BannerToast bannerToast = (BannerToast) MSZ.A0J(interfaceC09390do3);
                                Context context = bannerToast.getContext();
                                AbstractC31172DnG.A1B(context, bannerToast, AbstractC53242c7.A0H(context, R.attr.igds_color_tag_or_toast_background));
                                bannerToast.A01 = new PI8(c138376Ot);
                                bannerToast.setText(2131965608);
                            }
                            BannerToast bannerToast2 = (BannerToast) MSZ.A0J(interfaceC09390do3);
                            BannerToast.A00(bannerToast2);
                            if (bannerToast2.getHeight() == 0) {
                                bannerToast2.postDelayed(new POX(bannerToast2), 300L);
                            } else {
                                C55982hj c55982hj = bannerToast2.A00;
                                c55982hj.getClass();
                                c55982hj.A03();
                            }
                            c50549MTg2.A01.setVisibility(0);
                            AbstractC167007dF.A0L(c50549MTg2.A05).setVisibility(8);
                            AbstractC167017dG.A1W(c50549MTg2.A02, 8);
                            ((O4H) c50549MTg2.A07.getValue()).A00.setVisibility(8);
                            InterfaceC09390do interfaceC09390do4 = c50549MTg2.A04;
                            AbstractC124845kp.A01(AbstractC167007dF.A0L(interfaceC09390do4)).setLayoutTransition(null);
                            AbstractC43593JPy.A1Q(AbstractC166987dD.A17(interfaceC09390do4));
                            AbstractC167017dG.A1W(c50549MTg2.A06, 8);
                            C105824pt c105824pt = c147716kw.A00;
                            if (c105824pt != null) {
                                C147716kw.A00(c105824pt, c147716kw);
                                break;
                            }
                        }
                        break;
                    case 3:
                        C41181vS c41181vS = c138376Ot.A02;
                        if (c41181vS != null) {
                            c147716kw.A0R.A00(c41181vS, c138376Ot, "finished");
                            String str2 = c41181vS.A0j;
                            C14360o3.A07(str2);
                            C3KW.A03(c147716kw.A0N, str2);
                            c138376Ot.A0V.post(new RunnableC56937POe(c147716kw));
                            break;
                        }
                        break;
                    case 4:
                        c147716kw.A0R.A00(c138376Ot.A02, c138376Ot, "cobroadcast_start");
                        C147716kw.A01(c147716kw);
                        C147716kw.A02(c147716kw);
                        break;
                    case 5:
                    default:
                        c138376Ot.A01();
                        c138376Ot.A03(true);
                        break;
                    case 6:
                        C41181vS c41181vS2 = c138376Ot.A02;
                        if (c41181vS2 != null) {
                            c147716kw.A0R.A00(c41181vS2, c138376Ot, "ssi_checkpointed");
                            String str3 = c41181vS2.A0j;
                            C14360o3.A07(str3);
                            C3KW.A03(c147716kw.A0N, str3);
                            C138376Ot c138376Ot2 = c147716kw.A01;
                            if (c138376Ot2 != null) {
                                C147716kw.A01(c147716kw);
                                c138376Ot2.A03(false);
                                Context context2 = c138376Ot2.A0V.getContext();
                                AbstractC50547MTc.A03(c138376Ot2, AbstractC53242c7.A0H(context2, R.attr.igds_color_dimmer), true);
                                String A0u = AbstractC25227BEk.A0u(context2, 2131963262);
                                String A0u2 = AbstractC25227BEk.A0u(context2, 2131965607);
                                C50549MTg c50549MTg3 = c138376Ot2.A0e;
                                c50549MTg3.A01.setVisibility(0);
                                InterfaceC09390do interfaceC09390do5 = c50549MTg3.A04;
                                AbstractC37302Gc3.A06(interfaceC09390do5).setText(A0u);
                                AbstractC167017dG.A1W(interfaceC09390do5, 0);
                                InterfaceC09390do interfaceC09390do6 = c50549MTg3.A05;
                                AbstractC37302Gc3.A06(interfaceC09390do6).setText(A0u2);
                                AbstractC167017dG.A1W(interfaceC09390do6, 0);
                                InterfaceC09390do interfaceC09390do7 = c50549MTg3.A06;
                                AbstractC167007dF.A0L(interfaceC09390do7).setVisibility(8);
                                AbstractC167007dF.A0L(interfaceC09390do7).setOnClickListener(null);
                                C9SP c9sp = c50549MTg3.A00;
                                if (c9sp == null) {
                                    c9sp = new C9SP(context2.getString(2131963261), context2.getResources().getDimension(R.dimen.abc_text_size_menu_header_material), context2.getColor(AbstractC53242c7.A07(context2)), context2.getColor(AbstractC53242c7.A0D(context2)));
                                    c9sp.A03.A03();
                                }
                                c50549MTg3.A00 = c9sp;
                                View A0L = AbstractC167007dF.A0L(c50549MTg3.A02);
                                if (!AbstractC14490oL.A0C(context2)) {
                                    A0L.setVisibility(8);
                                    AbstractC167017dG.A1W(interfaceC09390do5, 8);
                                } else {
                                    A0L.setBackground(c50549MTg3.A00);
                                    Ok3.A00(A0L, 8, c138376Ot2);
                                    A0L.setVisibility(0);
                                }
                                C147716kw.A02(c147716kw);
                                break;
                            }
                        }
                        break;
                }
            }
            if (AbstractC166987dD.A0y().A0X()) {
                Context context3 = AbstractC12290kX.A00;
                switch (num.intValue()) {
                    case 0:
                        str = "VIEWER_LOADING";
                        break;
                    case 1:
                        str = "VIEWER_FATAL";
                        break;
                    case 2:
                        str = "BROADCASTER_INTERRUPT";
                        break;
                    case 3:
                        str = "BROADCASTER_END";
                        break;
                    case 4:
                        str = "VIEWER_COBROADCASTING";
                        break;
                    case 5:
                        str = "RETURN_FROM_COBROADCAST";
                        break;
                    case 6:
                        str = "SSI_CHECKPOINTED";
                        break;
                    default:
                        str = "NO_ERROR";
                        break;
                }
                C9GR.A09(context3, str);
            }
        }
    }

    public final boolean A01() {
        Integer num = this.A03;
        if (num != C05F.A0N && num != C05F.A0C && num != C05F.A0Y && num != C05F.A0u) {
            return false;
        }
        return true;
    }

    public C55012OVx(C147716kw c147716kw) {
        this.A07 = c147716kw;
    }
}

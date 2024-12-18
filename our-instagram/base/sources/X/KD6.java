package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class KD6 extends AbstractC59962oe implements InterfaceC189488aT, InterfaceC50436MOq, InterfaceC159877Ez, MSL {
    public static final String __redex_internal_original_name = "DirectUpsellTrayFragment";
    public FrameLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public NestedScrollView A06;
    public MUG A07;
    public UserSession A08;
    public DirectStickerSuggestionsController A09;
    public L3I A0A;
    public LAG A0B;
    public LAG A0C;
    public LAG A0D;
    public LAG A0E;
    public LGG A0F;
    public InterfaceC159877Ez A0G;
    public C7JS A0H;
    public C47419KxA A0I;
    public IgdsInlineSearchBox A0J;
    public Runnable A0K;
    public Runnable A0L;
    public Consumer A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public IgTextView A0Q;
    public C1581277x A0R;
    public AbstractC47789L8v A0S;
    public AbstractC47789L8v A0T;
    public AbstractC47789L8v A0U;
    public C7IK A0V;
    public C47765L7l A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final String A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final C47329Kve A0f = new C47329Kve(this);
    public final InterfaceC50473MQb A0g = new C48728Lgw(this);
    public final InterfaceC50475MQd A0h = new C48732Lh0(this);
    public final AnonymousClass987 A0i;
    public final String A0j;
    public final boolean A0k;

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        C14360o3.A0B(c7ik, 0);
        this.A0V = c7ik;
        A00();
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC159877Ez
    public final void Cyk(C148286ly c148286ly) {
        C14360o3.A0B(c148286ly, 0);
        Runnable runnable = this.A0L;
        if (runnable != null) {
            runnable.run();
        }
        InterfaceC159877Ez interfaceC159877Ez = this.A0G;
        if (interfaceC159877Ez != null) {
            interfaceC159877Ez.Cyk(c148286ly);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0J;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
    }

    @Override // X.MSL
    public final void DjQ(String str) {
        C14360o3.A0B(str, 0);
        AbstractC47789L8v abstractC47789L8v = this.A0U;
        if (abstractC47789L8v != null) {
            abstractC47789L8v.A00(str);
        }
        AbstractC47789L8v abstractC47789L8v2 = this.A0S;
        if (abstractC47789L8v2 != null) {
            abstractC47789L8v2.A00(str);
        }
        AbstractC47789L8v abstractC47789L8v3 = this.A0T;
        if (abstractC47789L8v3 != null) {
            abstractC47789L8v3.A00(str);
        }
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0270, code lost:
    
        if (A02() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0272, code lost:
    
        r4 = r19.A0c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027e, code lost:
    
        if (X.AbstractC167007dF.A1Z(X.AbstractC43592JPx.A0M(r4).A09) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0280, code lost:
    
        r7 = X.C07S.STARTED;
        r6 = getViewLifecycleOwner();
        X.AbstractC166987dD.A1Z(new X.MCI(r6, r7, r19, null, 9), X.C07Y.A00(r6));
        X.AbstractC43592JPx.A0M(r4).A02(X.EnumC143276dS.A0J);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010d, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
    
        r8 = "gifsSection";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        r5.addView(r4);
        X.AbstractC13880nE.A0s(r3, new X.M0Z(r3));
        r6 = r19.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011d, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
    
        r6.A02 = new X.C49485Lty(r19, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0127, code lost:
    
        r8 = "userSession";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012b, code lost:
    
        if (r19.A0P == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r6 = r19.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0131, code lost:
    
        r19.A09 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r6.A01(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController.class, new X.C50251MHg(r6, 0));
        r7 = r19.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0144, code lost:
    
        r6 = r19.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0146, code lost:
    
        if (r6 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0148, code lost:
    
        r14 = X.C05F.A0N;
        r5 = r19.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014c, code lost:
    
        if (r5 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014e, code lost:
    
        r5 = X.M8K.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0150, code lost:
    
        r19.A0E = new X.LAG(r6, r19, r7, r19, r14, r5);
        r4 = r19.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015f, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0161, code lost:
    
        r4 = r4.A03();
        r6 = (java.util.List) r4.A00;
        r5 = (X.InterfaceC19390xP) r4.A01;
        r4 = r19.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016f, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0171, code lost:
    
        r4.A04(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0178, code lost:
    
        if (A03() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017a, code lost:
    
        r12 = r19.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        r5 = X.C2054597s.A00;
        r4 = X.C16930sl.A00;
        r13 = r5.createWithAdditionalCapabilities(r4, r4);
        r14 = r19.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0188, code lost:
    
        if (r14 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018a, code lost:
    
        r10 = r19.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018c, code lost:
    
        if (r10 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018e, code lost:
    
        r8 = "powerupsSection";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0194, code lost:
    
        if (r19.A0Z != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0196, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019a, code lost:
    
        if (r19.A0Y == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        r15 = r19.A0X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a0, code lost:
    
        if (r15 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a2, code lost:
    
        r8 = "initialSearchTerm";
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a6, code lost:
    
        r19.A0F = new X.LGG(r10, r19.A07, r12, r13, r14, r15, r16, A02(), A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x019c, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02b1, code lost:
    
        throw X.AbstractC166997dE.A0g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b9, code lost:
    
        if (r19.A0O == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bb, code lost:
    
        r7 = r19.A0f;
        r6 = r19.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c1, code lost:
    
        r19.A0A = new X.L3I(getViewLifecycleOwner(), r6, r7);
        r6 = r19.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ce, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d0, code lost:
    
        r5 = r19.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d2, code lost:
    
        if (r5 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d4, code lost:
    
        r19.A0B = new X.LAG(r5, r19, r6, r19, X.C05F.A00, X.M8L.A00);
        r6 = r19.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e6, code lost:
    
        if (r6 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e8, code lost:
    
        X.AbstractC18560vj.A03(X.C07Y.A00(r6.A01), new X.C15340po(new X.MCE(r6, null, 36), ((com.instagram.stickersearch.AvatarStickerInteractor) r6.A04.getValue()).A03(null, X.EnumC143276dS.A0P, X.EnumC143286dT.A07, null, null, null, false, false)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0215, code lost:
    
        r5 = r19.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0217, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0219, code lost:
    
        r4 = r19.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x021b, code lost:
    
        if (r4 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021d, code lost:
    
        r14 = X.C05F.A0C;
        r15 = X.M8L.A00;
        r19.A0D = new X.LAG(r4, r19, r5, r19, r14, r15);
        r5 = r19.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022f, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0231, code lost:
    
        r4 = r19.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0233, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0235, code lost:
    
        r19.A0C = new X.LAG(r4, r19, r5, r19, X.C05F.A01, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0243, code lost:
    
        if (r19.A0N == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0245, code lost:
    
        DjQ("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024a, code lost:
    
        r4 = r19.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024c, code lost:
    
        if (r4 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024e, code lost:
    
        r4.post(new X.RunnableC49855M0a(r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0256, code lost:
    
        r19.A0W = new X.C47765L7l(requireContext(), r3);
        A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0266, code lost:
    
        if (r19.A0P != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x026a, code lost:
    
        if (r19.A0O != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KD6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        String str;
        C7IK c7ik = this.A0V;
        if (this.mView != null && c7ik != null) {
            AbstractC166997dE.A0S(requireView(), R.id.direct_star_tab_root_container).getBackground().setColorFilter(c7ik.A09, PorterDuff.Mode.SRC);
            IgdsInlineSearchBox igdsInlineSearchBox = this.A0J;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A05(c7ik.A0E);
            }
            LAG lag = this.A0E;
            if (lag != null) {
                lag.A02.setTextColor(c7ik.A0C);
            }
            LGG lgg = this.A0F;
            if (lgg != null) {
                TextView textView = lgg.A04;
                int i = c7ik.A0C;
                textView.setTextColor(i);
                lgg.A02.setTextColor(i);
            }
            LAG lag2 = this.A0B;
            if (lag2 != null) {
                lag2.A02.setTextColor(c7ik.A0C);
            }
            LAG lag3 = this.A0D;
            if (lag3 == null) {
                str = "stickerItemController";
            } else {
                TextView textView2 = lag3.A02;
                int i2 = c7ik.A0C;
                textView2.setTextColor(i2);
                LAG lag4 = this.A0C;
                if (lag4 == null) {
                    str = "gifItemController";
                } else {
                    lag4.A02.setTextColor(i2);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A01(KD6 kd6, boolean z, boolean z2) {
        IgTextView igTextView;
        int i;
        if (!kd6.A0P && !kd6.A0a && z && z2) {
            igTextView = kd6.A0Q;
            if (igTextView != null) {
                i = 0;
            } else {
                return;
            }
        } else {
            igTextView = kd6.A0Q;
            if (igTextView == null) {
                return;
            } else {
                i = 8;
            }
        }
        igTextView.setVisibility(i);
    }

    private final boolean A03() {
        String str = this.A0X;
        if (str != null) {
            Pattern pattern = AbstractC13670mt.A06;
            Matcher matcher = Patterns.WEB_URL.matcher(str);
            C14360o3.A07(matcher);
            boolean find = matcher.find();
            if (this.A0a) {
                String str2 = this.A0X;
                if (str2 != null) {
                    if (!AbstractC13670mt.A0E(str2) && !find) {
                        String str3 = this.A0X;
                        if (str3 != null) {
                            if (str3.length() != 0) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        C14360o3.A0F("initialSearchTerm");
        throw C00O.createAndThrow();
    }

    private final boolean A04() {
        UserSession userSession = this.A08;
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!AbstractC31178DnM.A1X(c06090Tz, userSession, 36322534127380794L)) {
                UserSession userSession2 = this.A08;
                if (userSession2 != null) {
                    if (!AbstractC31178DnM.A1X(c06090Tz, userSession2, 36322040206075859L)) {
                        UserSession userSession3 = this.A08;
                        if (userSession3 != null) {
                            if (!AbstractC31178DnM.A1X(c06090Tz, userSession3, 36322040206796764L) && !A02() && !this.A0O) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        if (!this.A0N) {
            return 0.5f;
        }
        return 0.7f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A0k;
    }

    @Override // X.InterfaceC159877Ez
    public final void DNq(EnumC46186KcO enumC46186KcO, C45026JwH c45026JwH) {
        Runnable runnable = this.A0K;
        if (runnable != null) {
            runnable.run();
        }
        InterfaceC159877Ez interfaceC159877Ez = this.A0G;
        if (interfaceC159877Ez != null) {
            interfaceC159877Ez.DNq(enumC46186KcO, c45026JwH);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0J;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r0.length() == 0) goto L12;
     */
    @Override // X.InterfaceC189498aU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DOM() {
        /*
            r4 = this;
            X.LGG r0 = r4.A0F
            if (r0 == 0) goto L37
            boolean r0 = r4.A0N
            if (r0 == 0) goto L19
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r4.A0J
            if (r0 == 0) goto L19
            java.lang.String r0 = r0.getSearchString()
            if (r0 == 0) goto L19
            int r0 = r0.length()
            r3 = 0
            if (r0 != 0) goto L1a
        L19:
            r3 = 1
        L1a:
            X.MUG r0 = r4.A07
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            X.AbstractC167017dG.A1N(r1, r0)
            X.MUG r2 = new X.MUG
            r2.<init>(r0, r1, r3)
            X.LGG r1 = r4.A0F
            if (r1 == 0) goto L35
            X.MUG r0 = r4.A07
            r1.A01(r0, r2)
        L35:
            r4.A07 = r2
        L37:
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r4.A0J
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.getSearchString()
            if (r0 == 0) goto L47
            int r0 = r0.length()
            if (r0 != 0) goto L5b
        L47:
            X.LAG r0 = r4.A0E
            if (r0 == 0) goto L4e
            r0.A01()
        L4e:
            X.LAG r1 = r4.A0B
            if (r1 == 0) goto L5b
            X.L3I r0 = r4.A0A
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r0.A03
            r1.A02(r0)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KD6.DOM():void");
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        IgdsInlineSearchBox igdsInlineSearchBox;
        if (this.A0F != null) {
            MUG mug = this.A07;
            java.util.Set set = (java.util.Set) mug.A00;
            List list = (List) mug.A03;
            AbstractC167007dF.A1K(set, list);
            MUG mug2 = new MUG(list, set, false);
            LGG lgg = this.A0F;
            if (lgg != null) {
                lgg.A01(this.A07, mug2);
            }
            this.A07 = mug2;
        }
        LAG lag = this.A0E;
        if (lag != null) {
            lag.A01.setVisibility(8);
        }
        LAG lag2 = this.A0B;
        if (lag2 != null) {
            lag2.A01.setVisibility(8);
        }
        if (this.A0N && (igdsInlineSearchBox = this.A0J) != null) {
            igdsInlineSearchBox.post(new M0Y(this));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0j;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0e);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        NestedScrollView nestedScrollView = this.A06;
        if (nestedScrollView == null || nestedScrollView.getScrollY() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        UserSession userSession = this.A08;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        ((L7A) userSession.A01(L7A.class, MHS.A00(userSession, 37))).A00(KON.A00);
        C47419KxA c47419KxA = this.A0I;
        if (c47419KxA != null) {
            C49318LrC c49318LrC = c47419KxA.A00;
            DirectStickerSuggestionsController directStickerSuggestionsController = c49318LrC.A01;
            if (directStickerSuggestionsController != null) {
                directStickerSuggestionsController.A04 = AbstractC166997dE.A0o();
            }
            c49318LrC.A00.post(new M1X(c49318LrC));
            c49318LrC.A02.A03.A01();
        }
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C47765L7l c47765L7l = this.A0W;
        if (c47765L7l == null) {
            C14360o3.A0F("roundedCornerHelper");
            throw C00O.createAndThrow();
        }
        c47765L7l.A00(i);
    }

    public KD6() {
        C50153MDg c50153MDg = new C50153MDg(this, 31);
        C50153MDg c50153MDg2 = new C50153MDg(this, 33);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C50153MDg(c50153MDg2, 34));
        this.A0d = AbstractC25225BEi.A0a(new C50153MDg(A00, 35), c50153MDg, new C37018GSz(5, A00, null), AbstractC25225BEi.A1D(C44514JmK.class));
        C50153MDg c50153MDg3 = new C50153MDg(this, 30);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C50153MDg(new C50153MDg(this, 36), 37));
        this.A0c = AbstractC25225BEi.A0a(new C50153MDg(A002, 38), c50153MDg3, new C37018GSz(6, A002, null), AbstractC25225BEi.A1D(C148236lt.class));
        this.A0i = new AnonymousClass987();
        this.A07 = new MUG((List) AbstractC166987dD.A1E(), AnonymousClass541.A04, false);
        this.A0b = "ig_direct_thread";
        this.A0e = AbstractC60492pY.A02(this);
        this.A0j = __redex_internal_original_name;
        this.A0k = true;
    }

    private final boolean A02() {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        if (A03()) {
            UserSession userSession2 = this.A08;
            String str = "userSession";
            if (userSession2 != null) {
                if (C20Y.A00(userSession2).A01.A00 == C125535lz.A00) {
                    if (this.A0Y) {
                        userSession = this.A08;
                        if (userSession != null) {
                            c06090Tz = C06090Tz.A05;
                            j = 36320871975166935L;
                            return C18U.A06(c06090Tz, userSession, j);
                        }
                    } else {
                        C1581277x c1581277x = this.A0R;
                        if (c1581277x == null) {
                            str = "avatarPowerupGating";
                        } else {
                            userSession = c1581277x.A00;
                            c06090Tz = C06090Tz.A05;
                            j = 36320030161641392L;
                            return C18U.A06(c06090Tz, userSession, j);
                        }
                    }
                } else {
                    return false;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r2, 36322358033656005L) != false) goto L11;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KD6.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-854687926);
        C14360o3.A0B(layoutInflater, 0);
        this.A0i.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_star_tab, viewGroup, false);
        C0f9.A09(379629472, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1463125116);
        this.A0i.A01();
        super.onDestroyView();
        LGG lgg = this.A0F;
        if (lgg != null) {
            C7JS c7js = lgg.A0B;
            C15500q5.A00(c7js.A02).remove(lgg.A09);
        }
        L3I l3i = this.A0A;
        if (l3i != null) {
            l3i.A00 = null;
        }
        LAG lag = this.A0E;
        if (lag != null) {
            AbstractC25229BEm.A1R(lag.A00);
        }
        this.A06 = null;
        this.A0Q = null;
        this.A0J = null;
        C0f9.A09(1074586383, A02);
    }
}

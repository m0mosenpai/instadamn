package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes8.dex */
public final class KCL extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final InputFilter A0K;
    public static final InputFilter[] A0L;
    public static final String __redex_internal_original_name = "DirectEditQuickReplyFragment";
    public int A00;
    public int A01;
    public int A02;
    public EditText A03;
    public EditText A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public UserSession A08;
    public C7P0 A09;
    public C46512KiB A0A;
    public C44178Jfh A0B;
    public View A0E;
    public IgdsListCell A0F;
    public boolean A0G;
    public boolean A0H;
    public final TextWatcher A0I = new LO2(this, 6);
    public Integer A0C = C05F.A01;
    public boolean A0D = true;
    public final InterfaceC37166GZd A0J = new C48662Lfp(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C7P2 c7p2;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = this.A0F;
        if (igdsListCell == null) {
            str = "assignLabelCell";
        } else if (igdsListCell.getVisibility() == 0) {
            C7P0 c7p0 = this.A09;
            if (c7p0 == null) {
                str = "tasLogger";
            } else {
                UserSession userSession = this.A08;
                if (userSession == null) {
                    str = "userSession";
                } else {
                    String str2 = userSession.userId;
                    boolean A1W = AbstractC167007dF.A1W(this.A0B);
                    C14360o3.A0B(str2, 0);
                    C7P1 c7p1 = C7P1.IMPRESSION;
                    if (A1W) {
                        c7p2 = C7P2.EDIT_SAVED_REPLY_PAGE_LABEL;
                    } else {
                        c7p2 = C7P2.NEW_SAVED_REPLY_PAGE_LABEL;
                    }
                    C7P0.A01(null, c7p1, c7p2, c7p0, null, str2);
                    return;
                }
            }
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    static {
        C63479Sns c63479Sns = C63479Sns.A00;
        A0K = c63479Sns;
        A0L = new InputFilter[]{c63479Sns};
    }

    public static final void A01(KCL kcl) {
        String str;
        C56352iT.A0t.A03(kcl.getActivity()).setIsLoading(true);
        EditText editText = kcl.A03;
        if (editText == null) {
            str = "messageField";
        } else {
            editText.setEnabled(false);
            EditText editText2 = kcl.A04;
            if (editText2 == null) {
                str = "shortcutField";
            } else {
                editText2.setEnabled(false);
                TextView textView = kcl.A05;
                if (textView != null) {
                    textView.setEnabled(false);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (X.AbstractC31177DnL.A0g(r4, r3, r2).length() <= 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.KCL r10) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCL.A02(X.KCL):void");
    }

    public static final void A03(KCL kcl, Integer num) {
        String str;
        if (num == C05F.A01 || AbstractC47853LBw.A00(num) != 0) {
            kcl.A0C = num;
            int A00 = AbstractC47853LBw.A00(num);
            if (A00 != 0) {
                str = kcl.requireContext().getString(A00);
            } else {
                str = "";
            }
            C14360o3.A0A(str);
            IgdsListCell igdsListCell = kcl.A0F;
            if (igdsListCell != null) {
                int i = 0;
                igdsListCell.A0K(str, false);
                IgdsListCell igdsListCell2 = kcl.A0F;
                if (igdsListCell2 != null) {
                    IgTextView subtitleView = igdsListCell2.getSubtitleView();
                    if (str.length() != 0) {
                        i = 8;
                    }
                    subtitleView.setVisibility(i);
                    IgdsListCell igdsListCell3 = kcl.A0F;
                    if (igdsListCell3 != null) {
                        igdsListCell3.setTextCellType(EnumC53237Nga.A04);
                        return;
                    }
                }
            }
            C14360o3.A0F("assignLabelCell");
            throw C00O.createAndThrow();
        }
    }

    public static final boolean A04(KCL kcl) {
        String str;
        EditText editText = kcl.A03;
        if (editText == null) {
            str = "messageField";
        } else {
            String A0g = AbstractC167007dF.A0g(editText);
            int length = A0g.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A1b = AbstractC31179DnN.A1b(A0g, i2);
                if (!z) {
                    if (!A1b) {
                        z = true;
                    } else {
                        i++;
                    }
                } else {
                    if (!A1b) {
                        break;
                    }
                    length--;
                }
            }
            String A0g2 = AbstractC31177DnL.A0g(A0g, length, i);
            EditText editText2 = kcl.A04;
            if (editText2 == null) {
                str = "shortcutField";
            } else {
                String A0g3 = AbstractC167007dF.A0g(editText2);
                int length2 = A0g3.length() - 1;
                int i3 = 0;
                boolean z2 = false;
                while (i3 <= length2) {
                    int i4 = length2;
                    if (!z2) {
                        i4 = i3;
                    }
                    boolean A1b2 = AbstractC31179DnN.A1b(A0g3, i4);
                    if (!z2) {
                        if (!A1b2) {
                            z2 = true;
                        } else {
                            i3++;
                        }
                    } else {
                        if (!A1b2) {
                            break;
                        }
                        length2--;
                    }
                }
                String A0g4 = AbstractC31177DnL.A0g(A0g3, length2, i3);
                if (A0g2.length() != 0 || A0g4.length() != 0) {
                    C44178Jfh c44178Jfh = kcl.A0B;
                    if (c44178Jfh == null || !A0g2.equals(c44178Jfh.A02) || !C14360o3.A0K(A0g4, c44178Jfh.A03) || kcl.A0C != c44178Jfh.A00) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_edit_quick_reply_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A08;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A0D && A04(this)) {
            A00(this);
            return true;
        }
        return false;
    }

    public static final void A00(KCL kcl) {
        C193328hC A0O = AbstractC31175DnJ.A0O(kcl);
        A0O.A0A(2131976209);
        A0O.A09(2131976208);
        A0O.A0I(null, 2131968555);
        AbstractC31176DnK.A17(DialogInterfaceOnClickListenerC48023LMs.A00(kcl, 37), A0O, 2131977166);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        int i = 2131959332;
        if (this.A0B != null) {
            i = 2131959333;
        }
        A00.A02 = getString(i);
        A00.A01 = ViewOnClickListenerC48072LPx.A00(this, 14);
        this.A0E = interfaceC56362iU.Ehj(new C31722DwR(A00));
        AbstractC31176DnK.A1C(ViewOnClickListenerC48072LPx.A00(this, 15), AbstractC31176DnK.A0I(), interfaceC56362iU);
        A02(this);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.KiB, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(702105546);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A06 = C023409i.A0A.A06(requireArguments);
        this.A08 = A06;
        this.A01 = 1000;
        this.A0G = C18U.A06(C06090Tz.A05, A06, 36329607938458029L);
        this.A02 = AbstractC53242c7.A09(requireContext());
        String string = requireArguments.getString("DirectEditQuickReplyFragment.quick_reply_id");
        if (string != null) {
            UserSession userSession = this.A08;
            if (userSession != null) {
                C44178Jfh c44178Jfh = (C44178Jfh) JUJ.A00(userSession).A07.get(string);
                this.A0B = c44178Jfh;
                if (c44178Jfh == null) {
                    IllegalStateException A0g = AbstractC166997dE.A0g();
                    C0f9.A09(1051280217, A02);
                    throw A0g;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        String string2 = requireArguments.getString("source_module");
        String string3 = requireArguments.getString("waterfall_id");
        String string4 = requireArguments.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        ?? obj = new Object();
        obj.A01 = string2;
        obj.A02 = string3;
        obj.A00 = string4;
        this.A0A = obj;
        UserSession userSession2 = this.A08;
        if (userSession2 != null) {
            JUJ.A00(userSession2).A00 = this.A0J;
            this.A00 = AbstractC53242c7.A03(requireContext());
            UserSession userSession3 = this.A08;
            if (userSession3 != null) {
                this.A09 = new C7P0(this, userSession3);
                C0f9.A09(-1565978910, A02);
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            r0 = -808930311(0xffffffffcfc8b3f9, float:-6.734476E9)
            int r3 = X.C0f9.A02(r0)
            r7 = 0
            X.C14360o3.A0B(r12, r7)
            android.os.Bundle r9 = r11.requireArguments()
            X.09Y r0 = X.C023409i.A0A
            com.instagram.common.session.UserSession r0 = r0.A06(r9)
            r11.A08 = r0
            r0 = 2131625614(0x7f0e068e, float:1.887844E38)
            android.view.View r4 = r12.inflate(r0, r13, r7)
            r0 = 2131436202(0x7f0b22aa, float:1.8494268E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r11.A03 = r0
            r0 = 2131441397(0x7f0b36f5, float:1.8504804E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r11.A04 = r0
            r0 = 2131436301(0x7f0b230d, float:1.8494469E38)
            android.widget.TextView r0 = X.AbstractC166997dE.A0T(r4, r0)
            r11.A06 = r0
            r0 = 2131441406(0x7f0b36fe, float:1.8504823E38)
            android.widget.TextView r0 = X.AbstractC166997dE.A0T(r4, r0)
            r11.A07 = r0
            r0 = 2131428189(0x7f0b035d, float:1.8478015E38)
            com.instagram.igds.components.textcell.IgdsListCell r0 = X.AbstractC31173DnH.A0Y(r4, r0)
            r11.A0F = r0
            r0 = 2131428190(0x7f0b035e, float:1.8478017E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r4, r0)
            boolean r0 = r11.A0G
            java.lang.String r10 = "assignLabelCell"
            if (r0 == 0) goto L6f
            r1.setVisibility(r7)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r11.A0F
            if (r0 == 0) goto Lef
            r0.setVisibility(r7)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r11.A0F
            if (r1 == 0) goto Lef
            r0 = 16
            X.ViewOnClickListenerC48072LPx.A01(r1, r0, r11)
        L6f:
            X.Jfh r8 = r11.A0B
            java.lang.String r6 = "shortcutField"
            java.lang.String r5 = "messageField"
            if (r8 == 0) goto Ld7
            android.content.Context r2 = r11.requireContext()
            android.widget.EditText r1 = r11.A03
            if (r1 == 0) goto Leb
            java.lang.String r0 = r8.A02
            r1.setText(r0)
            android.widget.EditText r0 = r11.A04
            if (r0 == 0) goto Lf3
            java.lang.String r1 = r8.A03
            r0.setText(r1)
            r0 = 2131431424(0x7f0b1000, float:1.8484577E38)
            android.widget.TextView r1 = X.AbstractC166987dD.A0e(r4, r0)
            r11.A05 = r1
            if (r1 == 0) goto La6
            r0 = 2131959328(0x7f131e20, float:1.9555293E38)
            X.AbstractC166987dD.A1P(r2, r1, r0)
            r1.setVisibility(r7)
            r0 = 17
            X.ViewOnClickListenerC48072LPx.A01(r1, r0, r11)
        La6:
            java.lang.Integer r0 = r8.A00
            X.C14360o3.A07(r0)
            A03(r11, r0)
        Lae:
            android.widget.EditText r0 = r11.A03
            if (r0 == 0) goto Leb
            android.text.TextWatcher r2 = r11.A0I
            r0.addTextChangedListener(r2)
            android.widget.EditText r1 = r11.A04
            if (r1 == 0) goto Lf3
            android.text.InputFilter[] r0 = X.KCL.A0L
            r1.setFilters(r0)
            android.widget.EditText r0 = r11.A04
            if (r0 == 0) goto Lf3
            r0.addTextChangedListener(r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r11.A0F
            if (r1 == 0) goto Lef
            X.Nga r0 = X.EnumC53237Nga.A04
            r1.setTextCellType(r0)
            r0 = 145539629(0x8acc22d, float:1.0397524E-33)
            X.C0f9.A09(r0, r3)
            return r4
        Ld7:
            java.lang.String r2 = "DirectEditQuickReplyFragment.quick_reply_message"
            boolean r0 = r9.containsKey(r2)
            if (r0 == 0) goto Lae
            android.widget.EditText r1 = r11.A03
            if (r1 == 0) goto Leb
            java.lang.String r0 = r9.getString(r2)
            r1.setText(r0)
            goto Lae
        Leb:
            X.C14360o3.A0F(r5)
            goto Lf6
        Lef:
            X.C14360o3.A0F(r10)
            goto Lf6
        Lf3:
            X.C14360o3.A0F(r6)
        Lf6:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCL.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-2074793521);
        super.onDestroy();
        UserSession userSession = this.A08;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        JUJ.A00(userSession).A00 = null;
        C0f9.A09(-43337007, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        String str;
        int A02 = C0f9.A02(1289135669);
        super.onResume();
        Activity rootActivity = getRootActivity();
        if (rootActivity != null && (window = rootActivity.getWindow()) != null) {
            window.setSoftInputMode(16);
            if (!this.A0H) {
                IgdsListCell igdsListCell = this.A0F;
                if (igdsListCell == null) {
                    str = "assignLabelCell";
                } else if (igdsListCell.getVisibility() != 0) {
                    this.A0H = true;
                    EditText editText = this.A04;
                    str = "shortcutField";
                    if (editText != null) {
                        editText.requestFocus();
                        EditText editText2 = this.A04;
                        if (editText2 != null) {
                            AbstractC13880nE.A0R(editText2);
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C0f9.A09(-526121344, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-405274865, A02);
        throw A0g;
    }
}

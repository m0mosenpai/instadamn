package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wil, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnFocusChangeListenerC70880Wil implements InterfaceC58115Ppe, View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL, InterfaceC25183BCg {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View.OnTouchListener A04;
    public View A05;
    public View A06;
    public EditText A07;
    public TextView A08;
    public InterfaceC56392iX A09;
    public InterfaceC56392iX A0A;
    public OWa A0B;
    public IgdsSwitch A0C;
    public ChoreographerFrameCallbackC45694KKg A0D;
    public EnumC209229Ne A0E;
    public Date A0F;
    public int[] A0G;
    public int A0H;
    public final View A0I;
    public final ViewStub A0J;
    public final FragmentActivity A0K;
    public final UserSession A0L;
    public final InterfaceC1810081c A0M;
    public final C88W A0N;
    public final FittingTextView A0O;
    public final VBA A0P;
    public final ArrayList A0Q;
    public final C8O8 A0R;
    public final C8NX A0S;

    public ViewOnFocusChangeListenerC70880Wil(View view, FragmentActivity fragmentActivity, UserSession userSession, C3I9 c3i9, C8O8 c8o8, InterfaceC1810081c interfaceC1810081c, C8NX c8nx) {
        C14360o3.A0B(c8o8, 7);
        this.A0K = fragmentActivity;
        this.A0L = userSession;
        this.A0M = interfaceC1810081c;
        this.A0S = c8nx;
        this.A0R = c8o8;
        this.A0N = new C88W(fragmentActivity, c3i9, this);
        this.A0P = new VBA();
        this.A0I = AbstractC166987dD.A0c(view, R.id.text_overlay_edit_text_container);
        this.A0J = (ViewStub) AbstractC166987dD.A0c(view, R.id.countdown_sticker_editor_stub);
        this.A0O = (FittingTextView) AbstractC166987dD.A0c(view, R.id.done_button);
        ArrayList arrayList = A4H.A00;
        this.A0Q = arrayList;
        this.A0E = (EnumC209229Ne) AbstractC31173DnH.A0i(arrayList, 0);
        this.A0G = new int[2];
    }

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    @Override // android.view.View.OnFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            r1 = 0
            X.C14360o3.A0B(r5, r1)
            java.lang.String r3 = "stickerPrivateAccountToggleViewStubHolder"
            r2 = 1
            X.88W r0 = r4.A0N
            if (r6 == 0) goto L3b
            r0.A00()
            X.AbstractC13880nE.A0S(r5)
            X.OWa r0 = r4.A0B
            if (r0 != 0) goto L1f
            java.lang.String r3 = "datePickerController"
        L17:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1f:
            r0.A01()
            A02(r4, r2)
            X.2iX r1 = r4.A09
            if (r1 == 0) goto L17
            boolean r0 = r1.CWW()
            if (r0 == 0) goto L59
            android.view.View r0 = r1.getView()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C150956qv.A09(r0, r2)
            goto L59
        L3b:
            r0.A01()
            X.AbstractC13880nE.A0O(r5)
            A02(r4, r1)
            X.2iX r1 = r4.A09
            if (r1 == 0) goto L17
            boolean r0 = r1.CWW()
            if (r0 == 0) goto L59
            android.view.View r0 = r1.getView()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C150956qv.A08(r0, r2)
        L59:
            android.widget.TextView r0 = r4.A08
            if (r0 != 0) goto L60
            java.lang.String r3 = "incompleteStickerErrorView"
            goto L17
        L60:
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C150956qv.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC70880Wil.onFocusChange(android.view.View, boolean):void");
    }

    private final void A00() {
        ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = this.A0D;
        if (choreographerFrameCallbackC45694KKg == null) {
            C14360o3.A0F("countdownStickerTimeCardsDrawable");
            throw C00O.createAndThrow();
        }
        Drawable mutate = choreographerFrameCallbackC45694KKg.mutate();
        C14360o3.A0C(mutate, AbstractC111324zv.A00(2793));
        ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg2 = (ChoreographerFrameCallbackC45694KKg) mutate;
        int i = this.A02;
        float f = 1.0f;
        if (A05(this)) {
            f = 0.3f;
        }
        choreographerFrameCallbackC45694KKg2.A08(AbstractC13950nL.A07(i, f), this.A01, this.A03, this.A0H);
    }

    public static final void A01(ViewOnFocusChangeListenerC70880Wil viewOnFocusChangeListenerC70880Wil, EnumC209229Ne enumC209229Ne) {
        int i;
        String str;
        viewOnFocusChangeListenerC70880Wil.A0E = enumC209229Ne;
        int[] A02 = AbstractC209259Nh.A02(enumC209229Ne);
        viewOnFocusChangeListenerC70880Wil.A0G = A02;
        viewOnFocusChangeListenerC70880Wil.A02 = A02[0];
        if (enumC209229Ne == EnumC209229Ne.A0O) {
            viewOnFocusChangeListenerC70880Wil.A02 = AbstractC209259Nh.A00(enumC209229Ne);
            FragmentActivity fragmentActivity = viewOnFocusChangeListenerC70880Wil.A0K;
            viewOnFocusChangeListenerC70880Wil.A03 = fragmentActivity.getColor(R.color.countdown_sticker_title_text_color);
            viewOnFocusChangeListenerC70880Wil.A01 = fragmentActivity.getColor(R.color.chat_sticker_chat_bubble_color);
            i = fragmentActivity.getColor(R.color.countdown_sticker_footer_text_color);
        } else {
            viewOnFocusChangeListenerC70880Wil.A03 = -1;
            i = -855638017;
            viewOnFocusChangeListenerC70880Wil.A01 = -855638017;
        }
        viewOnFocusChangeListenerC70880Wil.A0H = i;
        View view = viewOnFocusChangeListenerC70880Wil.A06;
        if (view == null) {
            str = "stickerView";
        } else {
            Drawable mutate = view.getBackground().mutate();
            C14360o3.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColors(viewOnFocusChangeListenerC70880Wil.A0G);
            EditText editText = viewOnFocusChangeListenerC70880Wil.A07;
            str = "stickerTitleView";
            if (editText != null) {
                editText.setTextColor(viewOnFocusChangeListenerC70880Wil.A03);
                EditText editText2 = viewOnFocusChangeListenerC70880Wil.A07;
                if (editText2 != null) {
                    editText2.setHintTextColor(AbstractC13950nL.A07(viewOnFocusChangeListenerC70880Wil.A03, 0.5f));
                    viewOnFocusChangeListenerC70880Wil.A00();
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(ViewOnFocusChangeListenerC70880Wil viewOnFocusChangeListenerC70880Wil, boolean z) {
        InterfaceC56392iX interfaceC56392iX = viewOnFocusChangeListenerC70880Wil.A0A;
        if (interfaceC56392iX == null) {
            C14360o3.A0F("stickerPublicAccountNuxViewStubHolder");
            throw C00O.createAndThrow();
        }
        if (interfaceC56392iX.CWW()) {
            View view = interfaceC56392iX.getView();
            if (z && !A04(viewOnFocusChangeListenerC70880Wil)) {
                C150956qv.A09(new View[]{view}, true);
            } else {
                C150956qv.A08(new View[]{view}, true);
            }
        }
    }

    private final void A03(AlC alC) {
        EnumC209229Ne A01;
        Date date = null;
        EditText editText = this.A07;
        if (alC == null) {
            if (editText != null) {
                editText.setText("");
                this.A0F = null;
                ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = this.A0D;
                if (choreographerFrameCallbackC45694KKg != null) {
                    choreographerFrameCallbackC45694KKg.A09(null);
                    this.A00 = 0;
                    A01 = (EnumC209229Ne) AbstractC31173DnH.A0i(this.A0Q, 0);
                    A01(this, A01);
                    return;
                }
                C14360o3.A0F("countdownStickerTimeCardsDrawable");
            }
            C14360o3.A0F("stickerTitleView");
        } else {
            if (editText != null) {
                String str = alC.A00.A0B;
                if (str == null) {
                    str = "";
                }
                editText.setText(str);
                EditText editText2 = this.A07;
                if (editText2 != null) {
                    AbstractC167017dG.A18(editText2);
                    this.A0F = new Date(TimeUnit.SECONDS.toMillis(alC.A00()));
                    ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg2 = this.A0D;
                    if (choreographerFrameCallbackC45694KKg2 != null) {
                        if (!A05(this)) {
                            date = this.A0F;
                        }
                        choreographerFrameCallbackC45694KKg2.A09(date);
                        String str2 = alC.A00.A0A;
                        int[] iArr = AlC.A04;
                        int A0C = AbstractC13950nL.A0C(str2, iArr[0]);
                        int A0C2 = AbstractC13950nL.A0C(alC.A00.A09, iArr[1]);
                        A01 = AbstractC209259Nh.A01(EnumC209229Ne.A0H, Integer.valueOf(A0C), Integer.valueOf(A0C2));
                        ArrayList arrayList = this.A0Q;
                        if (!AbstractC001800i.A0u(arrayList, A01)) {
                            A01 = alC.A01;
                        }
                        C14360o3.A0B(arrayList, 0);
                        this.A00 = arrayList.indexOf(A01);
                        if (A01 == null) {
                            return;
                        }
                        A01(this, A01);
                        return;
                    }
                    C14360o3.A0F("countdownStickerTimeCardsDrawable");
                }
            }
            C14360o3.A0F("stickerTitleView");
        }
        throw C00O.createAndThrow();
    }

    public static final boolean A04(ViewOnFocusChangeListenerC70880Wil viewOnFocusChangeListenerC70880Wil) {
        EditText editText = viewOnFocusChangeListenerC70880Wil.A07;
        if (editText == null) {
            C14360o3.A0F("stickerTitleView");
            throw C00O.createAndThrow();
        }
        String A0g = AbstractC167007dF.A0g(editText);
        int length = A0g.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(A0g, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A19) {
                    break;
                }
                length--;
            }
        }
        if (AbstractC31177DnL.A0g(A0g, length, i).length() > 0 && !A05(viewOnFocusChangeListenerC70880Wil)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(ViewOnFocusChangeListenerC70880Wil viewOnFocusChangeListenerC70880Wil) {
        Date date = viewOnFocusChangeListenerC70880Wil.A0F;
        if (date != null) {
            return date.before(new Date());
        }
        return true;
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        View view = this.A06;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return C220919pF.class;
    }

    @Override // X.InterfaceC58115Ppe
    public final void D9K(Date date) {
        this.A0F = date;
        ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = this.A0D;
        if (choreographerFrameCallbackC45694KKg == null) {
            C14360o3.A0F("countdownStickerTimeCardsDrawable");
            throw C00O.createAndThrow();
        }
        choreographerFrameCallbackC45694KKg.A09(date);
        boolean A04 = A04(this);
        FittingTextView fittingTextView = this.A0O;
        fittingTextView.setEnabled(A04);
        AJq.A01(fittingTextView, A04);
        A00();
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        String str;
        String str2;
        C14360o3.A0B(obj, 0);
        if (this.A06 == null) {
            View inflate = this.A0J.inflate();
            this.A05 = inflate;
            if (inflate != null) {
                View requireViewById = inflate.requireViewById(R.id.countdown_sticker);
                this.A06 = requireViewById;
                if (requireViewById != null) {
                    Drawable mutate = requireViewById.getBackground().mutate();
                    C14360o3.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    ((GradientDrawable) mutate).setOrientation(GradientDrawable.Orientation.TL_BR);
                    C88W c88w = this.A0N;
                    View view = this.A06;
                    if (view == null) {
                        str = "stickerView";
                    } else {
                        c88w.A03(view);
                        View view2 = this.A06;
                        if (view2 != null) {
                            EditText editText = (EditText) view2.requireViewById(R.id.countdown_sticker_title);
                            this.A07 = editText;
                            str2 = "stickerTitleView";
                            if (editText != null) {
                                editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
                                EditText editText2 = this.A07;
                                if (editText2 != null) {
                                    C6QV.A02(editText2);
                                    EditText editText3 = this.A07;
                                    if (editText3 != null) {
                                        editText3.setOnFocusChangeListener(this);
                                        VBA vba = this.A0P;
                                        EditText editText4 = this.A07;
                                        if (editText4 != null) {
                                            C221549qJ c221549qJ = new C221549qJ(editText4, 2);
                                            List list = vba.A00;
                                            list.add(c221549qJ);
                                            FragmentActivity fragmentActivity = this.A0K;
                                            list.add(new VB9(fragmentActivity, this));
                                            UserSession userSession = this.A0L;
                                            this.A0B = new OWa(fragmentActivity, userSession, this, AbstractC166997dE.A0p(fragmentActivity, 2131957538), null, true, false, false, false);
                                            this.A0D = new ChoreographerFrameCallbackC45694KKg(userSession, fragmentActivity);
                                            View view3 = this.A06;
                                            if (view3 != null) {
                                                ImageView A0D = AbstractC31176DnK.A0D(view3, R.id.countdown_sticker_time_cards);
                                                ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = this.A0D;
                                                if (choreographerFrameCallbackC45694KKg == null) {
                                                    str2 = "countdownStickerTimeCardsDrawable";
                                                } else {
                                                    A0D.setImageDrawable(choreographerFrameCallbackC45694KKg);
                                                    WNO.A00(A0D, 38, this);
                                                    View view4 = this.A05;
                                                    if (view4 != null) {
                                                        ImageView A0D2 = AbstractC31176DnK.A0D(view4, R.id.countdown_sticker_color_button);
                                                        A0D2.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
                                                        C3P9 c3p9 = new C3P9(A0D2);
                                                        View view5 = this.A06;
                                                        if (view5 != null) {
                                                            c3p9.A02(A0D2, view5);
                                                            c3p9.A04 = new C68003V5v(this, 3);
                                                            c3p9.A00();
                                                            View view6 = this.A05;
                                                            if (view6 != null) {
                                                                this.A08 = (TextView) view6.requireViewById(R.id.incomplete_sticker_error_view);
                                                                this.A04 = new WO5(this, 7);
                                                                View view7 = this.A05;
                                                                str2 = "stickerEditorContainer";
                                                                if (view7 != null) {
                                                                    this.A09 = AbstractC56372iV.A01(view7.findViewById(R.id.countdown_sticker_private_account_toggle_stub), false, false);
                                                                    View view8 = this.A05;
                                                                    if (view8 != null) {
                                                                        this.A0A = AbstractC56372iV.A01(view8.findViewById(R.id.countdown_sticker_public_account_nux_stub), false, false);
                                                                        Integer A0M = C17060sy.A01.A01(userSession).A0M();
                                                                        Integer num = C05F.A01;
                                                                        str = "stickerPublicAccountNuxViewStubHolder";
                                                                        InterfaceC56392iX interfaceC56392iX = this.A0A;
                                                                        if (A0M == num) {
                                                                            if (interfaceC56392iX != null) {
                                                                                interfaceC56392iX.setVisibility(0);
                                                                                InterfaceC56392iX interfaceC56392iX2 = this.A09;
                                                                                if (interfaceC56392iX2 != null) {
                                                                                    interfaceC56392iX2.setVisibility(8);
                                                                                    this.A0C = null;
                                                                                }
                                                                                C14360o3.A0F("stickerPrivateAccountToggleViewStubHolder");
                                                                            }
                                                                        } else if (interfaceC56392iX != null) {
                                                                            interfaceC56392iX.setVisibility(8);
                                                                            InterfaceC56392iX interfaceC56392iX3 = this.A09;
                                                                            if (interfaceC56392iX3 != null) {
                                                                                View view9 = interfaceC56392iX3.getView();
                                                                                AbstractC166987dD.A1P(fragmentActivity, AbstractC167007dF.A0N(view9, R.id.sticker_setting_toggle_text), 2131956868);
                                                                                IgdsSwitch igdsSwitch = (IgdsSwitch) view9.requireViewById(R.id.sticker_setting_toggle);
                                                                                this.A0C = igdsSwitch;
                                                                                if (igdsSwitch != null) {
                                                                                    igdsSwitch.A07 = new C70950Wkw(this, 9);
                                                                                }
                                                                            }
                                                                            C14360o3.A0F("stickerPrivateAccountToggleViewStubHolder");
                                                                        }
                                                                        throw C00O.createAndThrow();
                                                                    }
                                                                }
                                                            } else {
                                                                str = "stickerEditorContainer";
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str2 = "stickerView";
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            str2 = "stickerEditorContainer";
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        View view10 = this.A0I;
        View view11 = this.A05;
        str = "stickerEditorContainer";
        if (view11 != null) {
            C150956qv.A09(new View[]{view10, view11}, false);
            View view12 = this.A05;
            if (view12 != null) {
                View.OnTouchListener onTouchListener = this.A04;
                if (onTouchListener == null) {
                    str = "editorContainerOnTouchListener";
                } else {
                    view12.setOnTouchListener(onTouchListener);
                    C88W c88w2 = this.A0N;
                    c88w2.A02(c88w2.A01);
                    IgdsSwitch igdsSwitch2 = this.A0C;
                    if (igdsSwitch2 != null) {
                        C23031Ai A00 = AbstractC23021Ah.A00(this.A0L);
                        igdsSwitch2.setChecked(AbstractC167017dG.A1b(A00, A00.A0A, C23031Ai.A8c, 236));
                    }
                    EditText editText5 = this.A07;
                    if (editText5 == null) {
                        str2 = "stickerTitleView";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    editText5.addTextChangedListener(this.A0P);
                    A03(((C187958Um) obj).A00);
                    boolean A04 = A04(this);
                    FittingTextView fittingTextView = this.A0O;
                    fittingTextView.setEnabled(A04);
                    AJq.A01(fittingTextView, A04);
                    A02(this, true);
                    C8O8 c8o8 = this.A0R;
                    C148276lx c148276lx = C148276lx.A1L;
                    c8o8.Dom("countdown_sticker_bundle_id");
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        long j;
        String str;
        C8NX c8nx = this.A0S;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A0L;
        Integer A0M = c08730cb.A01(userSession).A0M();
        int[] iArr = AlC.A04;
        AbstractC167017dG.A0x();
        User user = new URL(null, null, null, null, null, null, null, null, null, null, null, null, null).A00;
        String A0G = AbstractC13950nL.A0G(this.A01);
        String A0F = AbstractC13950nL.A0F(this.A02);
        boolean z = true;
        String A0F2 = AbstractC13950nL.A0F(this.A0G[1]);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Date date = this.A0F;
        if (date != null) {
            j = date.getTime();
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(timeUnit.toSeconds(j));
        if (A0M != C05F.A01) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!AbstractC167017dG.A1b(A00, A00.A0A, C23031Ai.A8c, 236)) {
                z = false;
            }
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        String A0F3 = AbstractC13950nL.A0F(this.A0G[0]);
        EditText editText = this.A07;
        if (editText != null) {
            c8nx.Dog(new AlC(VP3.A00(user, valueOf2, false, false, valueOf, null, null, A0G, A0F, A0F2, A0F3, AbstractC167007dF.A0g(editText), AbstractC13950nL.A0F(this.A03)), this.A0E), null);
            A03(null);
            EditText editText2 = this.A07;
            if (editText2 != null) {
                editText2.removeTextChangedListener(this.A0P);
                if (this.A06 != null) {
                    View view = this.A0I;
                    View view2 = this.A05;
                    if (view2 == null) {
                        str = "stickerEditorContainer";
                    } else {
                        C150956qv.A08(new View[]{view, view2}, false);
                        OWa oWa = this.A0B;
                        if (oWa == null) {
                            str = "datePickerController";
                        } else {
                            oWa.A01();
                            EditText editText3 = this.A07;
                            if (editText3 != null) {
                                editText3.clearFocus();
                                FittingTextView fittingTextView = this.A0O;
                                fittingTextView.setEnabled(true);
                                AJq.A01(fittingTextView, true);
                                A02(this, false);
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C8O8 c8o8 = this.A0R;
                C148276lx c148276lx = C148276lx.A1L;
                c8o8.Doh("countdown_sticker_bundle_id");
                return;
            }
        }
        str = "stickerTitleView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        OWa oWa = this.A0B;
        if (oWa == null) {
            C14360o3.A0F("datePickerController");
            throw C00O.createAndThrow();
        }
        C189478aR c189478aR = oWa.A00;
        if (c189478aR == null || !c189478aR.A0S()) {
            this.A0M.E4u(new Object());
        }
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
        String str;
        TextView textView = this.A08;
        if (textView == null) {
            str = "incompleteStickerErrorView";
        } else {
            View view = this.A06;
            if (view != null) {
                int top = i + view.getTop();
                if (this.A06 != null) {
                    textView.setY(top + r0.getHeight());
                    InterfaceC56392iX interfaceC56392iX = this.A09;
                    str = "stickerPrivateAccountToggleViewStubHolder";
                    if (interfaceC56392iX != null) {
                        if (!interfaceC56392iX.CWW()) {
                            interfaceC56392iX = this.A0A;
                            str = "stickerPublicAccountNuxViewStubHolder";
                            if (interfaceC56392iX != null) {
                                if (!interfaceC56392iX.CWW()) {
                                    return;
                                }
                            }
                        }
                        View view2 = interfaceC56392iX.getView();
                        if (view2 != null) {
                            view2.setY((i2 - C1812982h.A00) - view2.getHeight());
                            return;
                        }
                        return;
                    }
                }
            }
            C14360o3.A0F("stickerView");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}

package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: X.7Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160007Fm implements InterfaceC160017Fn, InterfaceC160027Fo, InterfaceC160037Fp, InterfaceC160047Fq, InterfaceC160057Fr, InterfaceC160067Fs, InterfaceC160077Ft {
    public int A00;
    public int A01;
    public int A02;
    public DataSetObserver A03;
    public Adapter A04;
    public RecyclerView A05;
    public C8SE A06;
    public C44178Jfh A07;
    public C161487Lj A08;
    public C7DZ A09;
    public C159547Dp A0A;
    public C7ON A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public ViewGroup A0F;
    public final int A0G;
    public final TextWatcher A0H;
    public final View A0I;

    @Deprecated
    public final View A0J;
    public final UserSession A0K;
    public final UserSession A0L;
    public final ColorFilterAlphaImageView A0M;
    public final ColorFilterAlphaImageView A0N;
    public final ColorFilterAlphaImageView A0O;
    public final C7G8 A0P;
    public final C159947Fg A0Q;
    public final ComposerAutoCompleteTextView A0R;
    public final ComposerAutoCompleteTextView A0S;
    public final /* synthetic */ C160117Fx A0T;
    public final /* synthetic */ C7G2 A0U;
    public final /* synthetic */ C7G2 A0V;
    public final /* synthetic */ C160137Fz A0W;
    public final /* synthetic */ C7G7 A0X;
    public final /* synthetic */ C160127Fy A0Y;

    public final void A03(C7IK c7ik, boolean z) {
        ImageView imageView;
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        C7G7 c7g7 = this.A0X;
        boolean A01 = C7G5.A00.A01(c7g7.A04);
        View view = (View) c7g7.A07.getValue();
        if (A01) {
            if ((view instanceof ColorFilterAlphaImageView) && (colorFilterAlphaImageView = (ColorFilterAlphaImageView) view) != null) {
                colorFilterAlphaImageView.setImageDrawable(colorFilterAlphaImageView.getContext().getDrawable(R.drawable.instagram_camera_pano_outline_24));
                colorFilterAlphaImageView.A04(c7ik.A0C, c7ik.A0D);
                return;
            }
            return;
        }
        if (!(view instanceof ImageView) || (imageView = (ImageView) view) == null || imageView.getDrawable() == null) {
            return;
        }
        AbstractC160187Ge.A01(c7g7.A03, imageView, c7ik, ((Number) c7g7.A0A.invoke()).intValue(), z, false);
    }

    public final void A04(AbstractC160207Gg abstractC160207Gg) {
        Integer A03 = abstractC160207Gg.A03();
        if (A03 != null) {
            int intValue = A03.intValue();
            ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A0S;
            if (AbstractC47857LCc.A01(composerAutoCompleteTextView, intValue) && !this.A0E) {
                return;
            }
            composerAutoCompleteTextView.setSelection(0);
            AbstractC47857LCc.A00(composerAutoCompleteTextView.getContext(), this.A0K, this.A0Q, composerAutoCompleteTextView, abstractC160207Gg, A06());
            composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.length());
        }
    }

    @Override // X.InterfaceC160027Fo
    public final void ADr(C7IK c7ik) {
        this.A0P.ADr(c7ik);
    }

    @Override // X.InterfaceC160057Fr
    public final View Ajw() {
        return this.A0T.Ajw();
    }

    @Override // X.InterfaceC160077Ft
    public final ColorFilterAlphaImageView BaP() {
        return this.A0V.BaP();
    }

    @Override // X.InterfaceC160017Fn
    public final void Cnr(Integer num, boolean z) {
        C14360o3.A0B(num, 0);
        this.A0X.Cnr(num, true);
    }

    @Override // X.InterfaceC160047Fq
    public final void Edc(boolean z) {
        this.A0W.Edc(z);
    }

    @Override // X.InterfaceC160047Fq
    public final void Edd(boolean z) {
        this.A0W.Edd(z);
    }

    @Override // X.InterfaceC160027Fo
    public final void Ehp(C7GY c7gy, C7GX c7gx, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(c7gx, 0);
        C14360o3.A0B(c7gy, 1);
        this.A0P.Ehp(c7gy, c7gx, interfaceC16660sJ, z);
    }

    @Override // X.InterfaceC160027Fo
    public final void FBu(C7GX c7gx, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(c7gx, 0);
        this.A0P.FBu(c7gx, interfaceC16660sJ, z);
    }

    @Override // X.InterfaceC160047Fq
    public final void FC6(boolean z, boolean z2) {
        this.A0W.FC6(z, z2);
    }

    @Override // X.InterfaceC160017Fn
    public final void FCA(Boolean bool, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A0X.FCA(bool, str, interfaceC16820sZ, z);
    }

    @Override // X.InterfaceC160017Fn
    public final void FCB(C7F3 c7f3, Boolean bool, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A0X.FCB(c7f3, bool, str, interfaceC16820sZ, z);
    }

    @Override // X.InterfaceC160017Fn
    public final void FCC(boolean z, InterfaceC16820sZ interfaceC16820sZ) {
        this.A0X.FCC(false, interfaceC16820sZ);
    }

    @Override // X.InterfaceC160017Fn
    public final void FCD(C9CH c9ch, C148286ly c148286ly, DirectStickerSuggestionsController directStickerSuggestionsController, InterfaceC16820sZ interfaceC16820sZ) {
        this.A0X.FCD(c9ch, c148286ly, directStickerSuggestionsController, interfaceC16820sZ);
    }

    @Override // X.InterfaceC160067Fs
    public final void FD4(boolean z) {
        this.A0U.FD4(z);
    }

    @Override // X.InterfaceC160027Fo
    public final void FD5(C7GY c7gy, C7GX c7gx, boolean z) {
        C14360o3.A0B(c7gx, 1);
        C14360o3.A0B(c7gy, 2);
        this.A0P.FD5(c7gy, c7gx, z);
    }

    public static void A00(C160007Fm c160007Fm, CharSequence charSequence) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = c160007Fm.A0S;
        Resources resources = c160007Fm.A0R.getResources();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        int i = R.integer.composer_max_lines;
        if (isEmpty) {
            i = R.integer.direct_composer_hint_max_lines;
        }
        composerAutoCompleteTextView.setMaxLines(resources.getInteger(i));
    }

    public static boolean A01(C160007Fm c160007Fm) {
        UserSession userSession = c160007Fm.A0K;
        if (!C18U.A06(C06090Tz.A05, userSession, 36328267908791700L)) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36328267908791700L) && !C18U.A06(c06090Tz, userSession, 36328267909119385L)) {
                return false;
            }
        }
        return true;
    }

    public final List A02() {
        C7DZ c7dz = this.A09;
        if (c7dz != null) {
            List list = c7dz.A00.A02;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C219829nU) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C219829nU) it.next()).A01);
            }
            return arrayList2;
        }
        return new ArrayList();
    }

    public final void A05(String str) {
        if (str == null) {
            str = "";
        }
        C160127Fy c160127Fy = this.A0Y;
        if (!AbstractC13670mt.A0G(c160127Fy.A00.trim(), str.trim())) {
            this.A0R.A02 = A01(this);
            c160127Fy.A00 = str;
            this.A0S.post(new Runnable() { // from class: X.Ase
                @Override // java.lang.Runnable
                public final void run() {
                    C160007Fm c160007Fm = C160007Fm.this;
                    ComposerAutoCompleteTextView composerAutoCompleteTextView = c160007Fm.A0S;
                    composerAutoCompleteTextView.setText(c160007Fm.A0Y.A00);
                    AbstractC167017dG.A18(composerAutoCompleteTextView);
                }
            });
        }
    }

    public final boolean A06() {
        C2UU c2uu;
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null || (c2uu = recyclerView.A0A) == null || c2uu.getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC160067Fs
    public final void ADk(InterfaceC16620sF interfaceC16620sF) {
        this.A0U.A02 = interfaceC16620sF;
    }

    @Override // X.InterfaceC160037Fp
    public final String Auv() {
        return this.A0Y.A00;
    }

    @Override // X.InterfaceC160037Fp
    public final Editable B0K() {
        return this.A0Y.A01.getText();
    }

    public C160007Fm(Activity activity, View view, FrameLayout frameLayout, final ListAdapter listAdapter, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159747Em c159747Em, final C159977Fj c159977Fj, final C159987Fk c159987Fk, final C159997Fl c159997Fl, C7DZ c7dz, C7FM c7fm, C7FO c7fo, C159547Dp c159547Dp, final C159947Fg c159947Fg, C148396m9 c148396m9, boolean z) {
        InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.7Fu
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Integer.valueOf(C159977Fj.this.A00.A01);
            }
        };
        InterfaceC16820sZ interfaceC16820sZ2 = new InterfaceC16820sZ() { // from class: X.7Fv
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C159987Fk.this.A00.A0U;
            }
        };
        InterfaceC16820sZ interfaceC16820sZ3 = new InterfaceC16820sZ() { // from class: X.7Fw
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C159997Fl.this.A00.A0W;
            }
        };
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(view, 3);
        C14360o3.A0B(frameLayout, 4);
        C14360o3.A0B(c7fm, 7);
        C14360o3.A0B(c7fo, 10);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = (ComposerAutoCompleteTextView) view.findViewById(R.id.row_thread_composer_edittext);
        C160117Fx c160117Fx = new C160117Fx(view, userSession);
        C160127Fy c160127Fy = new C160127Fy(composerAutoCompleteTextView);
        C160137Fz c160137Fz = new C160137Fz(activity, view, userSession, c160127Fy, c7fm, c159947Fg, c148396m9, interfaceC16820sZ3);
        C7G2 c7g2 = new C7G2(view, userSession, c7fm, c7fo);
        View findViewById = view.findViewById(R.id.composer_content_container);
        C14360o3.A07(findViewById);
        C7G7 c7g7 = new C7G7(findViewById, view, frameLayout, userSession, c160117Fx, c7g2, c7fm, interfaceC16820sZ, interfaceC16820sZ2);
        C7G8 c7g8 = new C7G8(activity, view, userSession, c160117Fx, c7fm);
        C14360o3.A0B(composerAutoCompleteTextView, 13);
        this.A0U = c7g2;
        this.A0W = c160137Fz;
        this.A0Y = c160127Fy;
        this.A0X = c7g7;
        this.A0V = c7g2;
        this.A0T = c160117Fx;
        this.A0L = userSession;
        this.A0R = composerAutoCompleteTextView;
        this.A0P = c7g8;
        this.A01 = 0;
        this.A00 = 0;
        this.A0C = "";
        this.A0E = false;
        Context context = view.getContext();
        this.A0J = view;
        this.A0K = userSession;
        this.A0D = z;
        this.A0Q = c159947Fg;
        this.A04 = listAdapter;
        this.A09 = c7dz;
        this.A0A = c159547Dp;
        this.A0C = context.getString(2131960654);
        View findViewById2 = view.findViewById(R.id.row_thread_composer_textarea_container);
        findViewById2.getClass();
        this.A0I = findViewById2;
        View findViewById3 = view.findViewById(R.id.row_thread_composer_edittext);
        findViewById3.getClass();
        ComposerAutoCompleteTextView composerAutoCompleteTextView2 = (ComposerAutoCompleteTextView) findViewById3;
        this.A0S = composerAutoCompleteTextView2;
        AbstractC56952jT.A04(composerAutoCompleteTextView2, C05F.A0Y);
        int integer = context.getResources().getInteger(R.integer.max_message_length);
        this.A0G = integer;
        composerAutoCompleteTextView2.setTextAppearance(R.style.InThreadComposerTextAreaRedesign);
        composerAutoCompleteTextView2.setTextSize(2, 16.0f);
        composerAutoCompleteTextView2.setMaxLines(context.getResources().getInteger(R.integer.direct_composer_hint_max_lines));
        composerAutoCompleteTextView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(integer)});
        C159547Dp c159547Dp2 = this.A0A;
        if (c159547Dp2 != null) {
            composerAutoCompleteTextView2.A01(c159547Dp2);
        }
        TextWatcher textWatcher = new TextWatcher() { // from class: X.7G9
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
            
                if (((java.lang.Boolean) r3).booleanValue() != false) goto L28;
             */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void afterTextChanged(android.text.Editable r20) {
                /*
                    Method dump skipped, instructions count: 1141
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C7G9.afterTextChanged(android.text.Editable):void");
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C160007Fm c160007Fm = C160007Fm.this;
                String charSequence2 = charSequence.toString();
                C14360o3.A0B(charSequence2, 0);
                c160007Fm.A0Y.A00 = charSequence2;
                C160137Fz c160137Fz2 = c160007Fm.A0W;
                if (!c160137Fz2.A01) {
                    C159947Fg c159947Fg2 = c160137Fz2.A07;
                    if (charSequence.length() > 0 || i != 0 || i2 != 0 || i3 != 0) {
                        c159947Fg2.A04.A01.A1i.A08(true);
                    }
                } else {
                    c160137Fz2.A01 = false;
                }
                Context context2 = c160007Fm.A0S.getContext();
                if (charSequence.length() >= c160007Fm.A0G) {
                    C9GR.A07(context2, 2131959928);
                }
            }
        };
        this.A0H = textWatcher;
        composerAutoCompleteTextView2.addTextChangedListener(textWatcher);
        final Adapter adapter = this.A04;
        if (adapter != null) {
            DataSetObserver dataSetObserver = new DataSetObserver() { // from class: X.7C6
                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    super.onChanged();
                    Adapter adapter2 = adapter;
                    C160007Fm c160007Fm = this;
                    int count = adapter2.getCount();
                    ComposerAutoCompleteTextView composerAutoCompleteTextView3 = c160007Fm.A0S;
                    int i = ((IgAutoCompleteTextView) composerAutoCompleteTextView3).A01;
                    int i2 = c160007Fm.A02;
                    int min = Math.min(i2, i * count);
                    composerAutoCompleteTextView3.setDropDownVerticalOffset(i2 - min);
                    composerAutoCompleteTextView3.setDropDownHeight(Math.max(-1, min));
                }
            };
            this.A03 = dataSetObserver;
            adapter.registerDataSetObserver(dataSetObserver);
        }
        if (listAdapter instanceof C159637Dz) {
            C7ON c7on = new C7ON(userSession);
            this.A0B = c7on;
            c7on.A01 = new C7C8() { // from class: X.7C7
                @Override // X.C7C8
                public final int getSpanEnd(Object obj) {
                    return C160007Fm.this.A0S.getText().getSpanEnd(obj);
                }

                @Override // X.C7C8
                public final int getSpanStart(Object obj) {
                    return C160007Fm.this.A0S.getText().getSpanStart(obj);
                }

                @Override // X.C7C8
                public final Object[] getSpans(int i, int i2, Class cls) {
                    return C160007Fm.this.A0S.getText().getSpans(i, i2, cls);
                }

                @Override // X.C7C8
                public final void removeSpan(Object obj) {
                    if (obj instanceof A7L) {
                        AbstractC160207Gg abstractC160207Gg = ((A7L) obj).A00;
                        if (abstractC160207Gg.A02() == C7FY.A04 && abstractC160207Gg.A01() == C7FZ.A03) {
                            C160007Fm c160007Fm = C160007Fm.this;
                            c160007Fm.A0R.A02 = C160007Fm.A01(c160007Fm);
                        }
                    }
                    C160007Fm.this.A0S.getText().removeSpan(obj);
                }

                @Override // X.C7C8
                public final void CKU(Editable editable) {
                    A7L[] a7lArr = (A7L[]) getSpans(0, editable.length(), A7L.class);
                    if (a7lArr != null) {
                        for (A7L a7l : a7lArr) {
                            if (a7l.A00.A02() == C7FY.A04 && a7l.A00.A01() == C7FZ.A03) {
                                C160007Fm.this.A0R.A02 = false;
                            }
                        }
                    }
                }
            };
            composerAutoCompleteTextView2.addTextChangedListener(c7on);
        }
        if (listAdapter != null) {
            ((IgAutoCompleteTextView) composerAutoCompleteTextView2).A04 = new InterfaceC162147Ny() { // from class: X.7C9
                @Override // X.InterfaceC162147Ny
                public final void DCb() {
                    EnumC72433Xdd enumC72433Xdd;
                    C159947Fg c159947Fg2 = c159947Fg;
                    C45025JwG c45025JwG = ((C159637Dz) ((C7E0) listAdapter)).A03;
                    if (c45025JwG != null) {
                        C159957Fh c159957Fh = c159947Fg2.A05;
                        AbstractC160207Gg abstractC160207Gg = c45025JwG.A02;
                        if (abstractC160207Gg != null || (c45025JwG.A00 > 0 && (abstractC160207Gg = c45025JwG.A01) != null)) {
                            C159967Fi c159967Fi = c159957Fh.A00;
                            String A00 = C159957Fh.A00(abstractC160207Gg);
                            C14360o3.A0B(A00, 0);
                            C18920wW c18920wW = c159967Fi.A00;
                            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_direct_command_system_triggered");
                            if (A002.isSampled()) {
                                Object obj = c159967Fi.A02.get();
                                C14360o3.A07(obj);
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                InterfaceC83713oG interfaceC83713oG = c159967Fi.A01;
                                String A02 = AbstractC92784Dr.A02(interfaceC83713oG);
                                if (A02 == null) {
                                    A02 = "";
                                }
                                Long A0k = AbstractC003100w.A0k(10, A02);
                                boolean A07 = AbstractC140946Yw.A07(interfaceC83713oG);
                                if (A07) {
                                    if (booleanValue) {
                                        enumC72433Xdd = EnumC72433Xdd.A03;
                                    } else {
                                        enumC72433Xdd = EnumC72433Xdd.A04;
                                    }
                                } else if (booleanValue) {
                                    enumC72433Xdd = EnumC72433Xdd.A05;
                                } else {
                                    enumC72433Xdd = EnumC72433Xdd.A06;
                                }
                                C0Zx c0Zx = new C0Zx();
                                c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A02);
                                c0Zx.A06("key", A02);
                                c0Zx.A01(enumC72433Xdd, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                A002.AAQ(c0Zx, "thread");
                                A002.A9K("recipient_id", A0k);
                                A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A00);
                                A002.A7v("is_e2ee", Boolean.valueOf(A07));
                                A002.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
                                A002.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
                                A002.Cht();
                            }
                        }
                    }
                }
            };
            composerAutoCompleteTextView2.setDropDownWidth(AbstractC13880nE.A0A(context));
            composerAutoCompleteTextView2.setDropDownAnchor(C7VR.A00(userSession) ? R.id.direct_thread_header : R.id.action_bar_wrapper);
            ((IgAutoCompleteTextView) composerAutoCompleteTextView2).A02 = 1;
            composerAutoCompleteTextView2.setSupportedLinks(C7OQ.A02);
            composerAutoCompleteTextView2.setAdapter(listAdapter);
            composerAutoCompleteTextView2.A01 = true;
            composerAutoCompleteTextView2.A02 = A01(this);
            final C7CC c7cc = new C7CC() { // from class: X.7CB
                @Override // X.C7CC
                public final void D3P(Object obj) {
                    C160007Fm c160007Fm = C160007Fm.this;
                    ComposerAutoCompleteTextView composerAutoCompleteTextView3 = c160007Fm.A0S;
                    AbstractC47857LCc.A00(composerAutoCompleteTextView3.getContext(), c160007Fm.A0K, c160007Fm.A0Q, composerAutoCompleteTextView3, obj, c160007Fm.A06());
                }
            };
            C159547Dp c159547Dp3 = this.A0A;
            if (c159547Dp3 != null) {
                c159547Dp3.A02 = c7cc;
                L9B l9b = c159547Dp3.A01;
                if (l9b != null) {
                    l9b.A01 = c7cc;
                }
            }
            composerAutoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: X.7CD
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                    Object obj;
                    C7CC c7cc2 = C7CC.this;
                    if (adapterView != null) {
                        obj = adapterView.getItemAtPosition(i);
                    } else {
                        obj = null;
                    }
                    c7cc2.D3P(obj);
                }
            });
            composerAutoCompleteTextView2.setOnTouchListener(new View.OnTouchListener() { // from class: X.7CE
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    C159547Dp c159547Dp4 = C160007Fm.this.A0A;
                    if (c159547Dp4 != null) {
                        c159547Dp4.A01();
                        return false;
                    }
                    return false;
                }
            });
        }
        View findViewById4 = view.findViewById(R.id.row_thread_composer_button_gallery);
        findViewById4.getClass();
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) findViewById4;
        this.A0M = colorFilterAlphaImageView;
        C0fQ.A00(new View.OnClickListener() { // from class: X.7GA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c159947Fg.A00(C160007Fm.this.A0D);
            }
        }, colorFilterAlphaImageView);
        View findViewById5 = view.findViewById(R.id.row_thread_composer_voice);
        findViewById5.getClass();
        this.A0O = (ColorFilterAlphaImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.row_thread_composer_button_sticker);
        findViewById6.getClass();
        this.A0N = (ColorFilterAlphaImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.row_thread_composer_buttons_container);
        findViewById7.getClass();
        this.A0F = (ViewGroup) findViewById7;
        C7DZ c7dz2 = this.A09;
        if (c7dz2 != null) {
            View view2 = this.A0J;
            Context context2 = view2.getContext();
            ViewStub viewStub = (ViewStub) view2.requireViewById(R.id.selected_media);
            if (viewStub != null) {
                this.A05 = (RecyclerView) viewStub.inflate();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2, 0, false);
                this.A06 = new C8SE(context2, this.A04, null, interfaceC11380iw, this.A0K, c7dz2.A00, null, null, c159747Em, Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material)), Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left)), new InterfaceC16820sZ() { // from class: X.B2T
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        return AbstractC166997dE.A0b();
                    }
                }, 1.0f, context2.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin), context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), context2.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left), false);
                this.A05.setLayoutManager(linearLayoutManager);
                this.A05.setAdapter(this.A06);
            }
        }
    }
}

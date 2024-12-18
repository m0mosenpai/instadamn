package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.ml.VisualFeatureStore;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.creation.toolbar.CreationToolbarView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.people.PeopleTag;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.MaP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50724MaP extends AbstractC59962oe implements InterfaceC60072op, InterfaceC58141Pq6, InterfaceC185668Ll {
    public static final String __redex_internal_original_name = "PhotoFilterFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public ViewFlipper A07;
    public RecyclerView A08;
    public IgFrameLayout A09;
    public ViewOnClickListenerC44797JsK A0A;
    public FilterViewContainer A0B;
    public MediaEditActionBar A0C;
    public C8LK A0D;
    public InterfaceC1829589q A0E;
    public AnonymousClass840 A0F;
    public AnonymousClass841 A0G;
    public C8Z9 A0H;
    public C81Y A0I;
    public InterfaceC58288Psg A0J;
    public VisualFeatureStore A0K;
    public C47811L9t A0L;
    public C51172MjG A0M;
    public OXA A0N;
    public C54763OHu A0O;
    public InterfaceC58286Pse A0P;
    public CreationToolbarView A0Q;
    public InterfaceC678133v A0R;
    public C47Z A0S;
    public InteractiveDrawableContainer A0T;
    public Integer A0U;
    public List A0V;
    public Map A0W;
    public AtomicBoolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public List A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final String A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC09390do A0i = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;

    public static final void A03(ImageView imageView, C50724MaP c50724MaP, int i) {
        if (imageView != null && c50724MaP.A0L == null) {
            InterfaceC09390do interfaceC09390do = c50724MaP.A0i;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Context themedContext = c50724MaP.getThemedContext();
            FragmentActivity requireActivity = c50724MaP.requireActivity();
            C47Z c47z = c50724MaP.A0S;
            C14360o3.A0A(c47z);
            C56332Ozt c56332Ozt = new C56332Ozt(c50724MaP);
            AnonymousClass841 anonymousClass841 = c50724MaP.A0G;
            if (anonymousClass841 == null) {
                C14360o3.A0F("creationCameraSession");
                throw C00O.createAndThrow();
            }
            C47811L9t c47811L9t = new C47811L9t(requireActivity, themedContext, imageView, c50724MaP, A0r, anonymousClass841, c56332Ozt, c47z, null, i, C18U.A06(C06090Tz.A06, AbstractC166987dD.A0r(interfaceC09390do), 36326464022460303L));
            c50724MaP.A0L = c47811L9t;
            c47811L9t.A00(imageView);
        }
    }

    @Override // X.InterfaceC58141Pq6
    public final void DCB() {
    }

    @Override // X.InterfaceC58141Pq6
    public final void DCC(View view, float f, float f2, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC185668Ll
    public final void Dr3(int i, int i2) {
    }

    @Override // X.InterfaceC185668Ll
    public final void DrA() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "photo_filter";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.creation.photo.edit.ui.creationprovider.CreationProvider");
        this.A0P = (InterfaceC58286Pse) requireActivity;
        C1UC requireActivity2 = requireActivity();
        C14360o3.A0C(requireActivity2, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
        AnonymousClass840 Ak4 = ((InterfaceC189608af) requireActivity2).Ak4();
        this.A0F = Ak4;
        if (Ak4 == null) {
            C14360o3.A0F("cameraSession");
            throw C00O.createAndThrow();
        }
        this.A0G = Ak4.A00();
        this.A0U = Integer.valueOf(AbstractC13890nF.A01(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x03cb, code lost:
    
        if (((X.MX5) r4).A01.A0I != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03da, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03db, code lost:
    
        r11.A05 = r4;
        r11.A03 = new X.C56241Oxo(r41, r21);
        r11.setOnTouchListener(new X.ViewOnTouchListenerC55488Okh(2, r7, r4, r41));
        r4 = r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03f3, code lost:
    
        if (r4 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03f7, code lost:
    
        if (r11.A05 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03f9, code lost:
    
        r4.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03fc, code lost:
    
        r19.A08(r41);
        r18.Ea5(new X.OJK(r9, r35, r36, r4, r41));
        r26 = X.C85K.A00(requireContext(), X.AbstractC166987dD.A0r(r2));
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0421, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0423, code lost:
    
        r29 = ((X.MX5) r4).A01.A01();
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x042d, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x042f, code lost:
    
        r30 = ((X.MX5) r4).A01.A00();
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0439, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x043b, code lost:
    
        r31 = r4.ATe();
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0441, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0443, code lost:
    
        r26.A01(r4.E4J(), X.C50700MZv.A00, r29, r30, r31);
        r41.A05 = r42.findViewById(com.facebook.R.id.tools_hidden_overlay);
        r41.A03 = r42.findViewById(com.facebook.R.id.gradient_overlay);
        r41.A07 = (android.widget.ViewFlipper) r42.requireViewById(com.facebook.R.id.creation_main_actions);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x046d, code lost:
    
        if (X.C50725MaQ.A02(r41) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x046f, code lost:
    
        r5 = r41.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0471, code lost:
    
        if (r5 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0473, code lost:
    
        r5.setVisibility(8);
        r5 = X.AbstractC31173DnH.A0E(X.AbstractC167007dF.A0M(r42, com.facebook.R.id.creation_bottom_toolbar), com.facebook.R.layout.creation_bottom_toolbar);
        X.C14360o3.A0C(r5, "null cannot be cast to non-null type com.instagram.creation.toolbar.CreationToolbarView");
        r5 = (com.instagram.creation.toolbar.CreationToolbarView) r5;
        r41.A0Q = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x048f, code lost:
    
        if (r5 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0491, code lost:
    
        r5.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0494, code lost:
    
        r5 = r41.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0496, code lost:
    
        if (r5 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0498, code lost:
    
        r5.setViewModel((X.C50930Mez) r41.A0f.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x04a3, code lost:
    
        r13 = r41.A0f;
        r12 = (X.C50930Mez) r13.getValue();
        r11 = X.C05F.A0C;
        r9 = X.AbstractC166987dD.A1E();
        r4 = r12.A02;
        r15 = r4.FDe().isEmpty();
        r7 = r12.A01;
        r14 = X.MX5.A01(r4);
        r5 = r4.CpK().size();
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04ca, code lost:
    
        if (r5 > 1) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04cc, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04d1, code lost:
    
        if (X.OY2.A02(r7, r14, r15, r4) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x04d3, code lost:
    
        X.MUG.A01(X.C05F.A00, r12, r9, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04de, code lost:
    
        if (X.AbstractC50722MaN.A00(r7) == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04e0, code lost:
    
        X.MUG.A01(X.C05F.A01, r12, r9, 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04eb, code lost:
    
        if (X.AbstractC50722MaN.A00(r7) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04ed, code lost:
    
        X.MUG.A01(r11, r12, r9, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04f2, code lost:
    
        X.MUG.A01(X.C05F.A0N, r12, r9, 11);
        X.MUG.A01(X.C05F.A0Y, r12, r9, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0506, code lost:
    
        if (X.MSX.A1Z(r9, r12.A05) == false) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0508, code lost:
    
        X.JQ0.A11(r41, X.PZV.A02(r41, null, 19), ((X.C50930Mez) r13.getValue()).A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0e61, code lost:
    
        r17 = "creationMainActionsFlipper";
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x051b, code lost:
    
        r4 = X.AbstractC31176DnK.A0C(r42, com.facebook.R.id.filter_picker_frame);
        r5 = androidx.recyclerview.widget.RecyclerView.A1E;
        r14 = new X.ViewOnClickListenerC44797JsK(getThemedContext());
        r41.A0A = r14;
        X.AbstractC43593JPy.A1B(r14, -1);
        r14.setClipChildren(false);
        r4.addView(r14);
        X.AbstractC53887NsJ.A00(X.AbstractC166987dD.A0r(r2));
        r14.setBlurIconCache(X.C50713MaC.A00(X.AbstractC166987dD.A0r(r2)));
        r14.A05 = true;
        r5 = r41.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x054f, code lost:
    
        if (r5 == null) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0551, code lost:
    
        r7 = X.C05F.A00;
        r14.A02 = new X.C56240Oxn(r5, r41, r7);
        r24 = X.AbstractC166987dD.A0r(r2);
        r4 = r41.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0560, code lost:
    
        if (r4 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0562, code lost:
    
        r5 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0564, code lost:
    
        if (r5 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0566, code lost:
    
        r12 = r5.E4J();
        r4 = (com.instagram.creation.activity.MediaCaptureActivity) r4;
        r11 = r4.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0572, code lost:
    
        if (r11.containsKey(r12) != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0574, code lost:
    
        r11.put(r12, new X.O2N(r4.A04, r4.A06));
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0580, code lost:
    
        r13 = r11.get(r12);
        r13.getClass();
        r13 = (X.O2N) r13;
        r4 = X.AbstractC53888NsK.A00(r24);
        r12 = X.AbstractC166987dD.A1E();
        r24 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0599, code lost:
    
        if (r24.hasNext() == false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x059b, code lost:
    
        r5 = (X.C54629OBe) r24.next();
        r11 = (X.InterfaceC50490MQs) r13.A00.get(r5.A00);
        r11.getClass();
        r9 = r5.A03;
        r5 = r5.A02;
        r4 = ((X.AbstractC48580LeI) r11).A00;
        r4.A03 = r9;
        r4.A02 = r5;
        r12.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x05bf, code lost:
    
        r41.A0V = r12;
        r14.setEffects(r12, false, X.AbstractC166987dD.A0r(r2));
        r9 = r14.getParent();
        X.AbstractC43592JPx.A1T(r9);
        r9 = (android.view.ViewGroup) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x05d5, code lost:
    
        if (A0B(r41) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05d9, code lost:
    
        if (r41.A0Y == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05db, code lost:
    
        r9 = android.view.LayoutInflater.from(getContext()).inflate(com.facebook.R.layout.accept_reject_edit_buttons_v4, r9, true);
        X.ViewOnClickListenerC55462OkH.A01(X.AbstractC166997dE.A0S(r9, com.facebook.R.id.button_accept_adjust), 29, r41);
        X.ViewOnClickListenerC55462OkH.A01(X.AbstractC166997dE.A0S(r9, com.facebook.R.id.button_cancel_adjust), 30, r41);
        r41.A02 = r9.requireViewById(com.facebook.R.id.bottom_button_container);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x060b, code lost:
    
        r14 = requireContext();
        r13 = X.AbstractC166987dD.A0r(r2);
        r4 = r41.A0A;
        X.C14360o3.A0B(r13, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0618, code lost:
    
        if (r4 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x061a, code lost:
    
        r12 = X.AbstractC166987dD.A1E();
        r11 = X.AbstractC166987dD.A1E();
        r24 = r4.getTileFrames().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x062e, code lost:
    
        if (r24.hasNext() == false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0630, code lost:
    
        r9 = (X.C44428Jkf) r24.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x063a, code lost:
    
        if (X.MSX.A04(r9) == (-1)) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x063c, code lost:
    
        r12.add(new X.O7H(r9, X.MSX.A04(r9)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x064d, code lost:
    
        if (X.AbstractC25226BEj.A1b(r11) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x064f, code lost:
    
        X.C50713MaC.A00(r13).A06(r14, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0656, code lost:
    
        X.C50713MaC.A00(r13).A07(r14, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x065d, code lost:
    
        r12 = X.AbstractC166987dD.A1E();
        r11 = X.EnumC53191Nfn.values();
        r9 = r11.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0667, code lost:
    
        if (r5 >= r9) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0669, code lost:
    
        r4 = r6.get(r11[r5]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x066f, code lost:
    
        if (r4 == null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0671, code lost:
    
        r12.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0674, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x06c1, code lost:
    
        r41.A0a = r12;
        r6 = (com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker) X.AbstractC166997dE.A0R(r42, com.facebook.R.id.tool_picker);
        r5 = r41.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x06ce, code lost:
    
        if (r5 == null) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x06d0, code lost:
    
        r11 = X.C05F.A01;
        r6.A05 = new X.C56240Oxn(r5, r41, r11);
        r6.setEffects(r41.A0a, false, X.AbstractC166987dD.A0r(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x06e6, code lost:
    
        if (A0A(r41) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x06e8, code lost:
    
        r12 = A01(r41);
        X.AbstractC53927Nt0.A00(r41, r12.A09, r12.A0A, null, X.C57353PdD.A00, new X.C57744PjX(r12, 36));
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x070e, code lost:
    
        if (X.C36A.A0F(X.AbstractC166987dD.A0r(r2)) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0710, code lost:
    
        r41.A0R = X.AbstractC677833s.A01(requireContext(), X.AbstractC166987dD.A0r(r2), null, new X.C677733r(requireContext(), X.AbstractC166987dD.A0r(r2)), X.C50724MaP.__redex_internal_original_name, false, true, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x073d, code lost:
    
        if (A0B(r41) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x073f, code lost:
    
        r4 = r41.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0741, code lost:
    
        if (r4 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0743, code lost:
    
        r6 = r4.getViewTreeObserver();
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0747, code lost:
    
        if (r6 == null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0749, code lost:
    
        r6.addOnGlobalLayoutListener(new X.ViewTreeObserverOnGlobalLayoutListenerC55496Okp(r41, 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0752, code lost:
    
        r6 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0762, code lost:
    
        if (X.C18U.A06(r2, r6, 36319325787004084L) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0764, code lost:
    
        X.AbstractC23641Du.A03(r7, new X.C12M().AOT(1632833315, 3), new X.MVR(r41, r42, r21, null, 6), X.AbstractC25229BEm.A0a(r41));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0789, code lost:
    
        r5 = X.AbstractC167017dG.A0U(r42, com.facebook.R.id.mif_creation_post_cap_tray_stub);
        X.C14360o3.A0C(r5, X.AbstractC111324zv.A00(9));
        r41.A08 = (androidx.recyclerview.widget.RecyclerView) r5;
        r9 = X.AbstractC09440dt.A01(new X.C57242PbQ(r41, 36));
        r26 = X.AbstractC166987dD.A0r(r2);
        r6 = r41.A0e;
        r30 = X.AbstractC166987dD.A1E();
        r13 = X.C51193Mjb.A01;
        r12 = requireContext();
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x07bb, code lost:
    
        if (r41.A0Y == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x07bd, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x07be, code lost:
    
        r4 = new X.C51172MjG(X.C8BN.NO_MUSIC_BROWSER, r26, new X.C56336Ozx(r41, r9), r11, r6, r30, r13.A00(r12, r4));
        r41.A0M = r4;
        r4.setHasStableIds(true);
        r5 = r41.A08;
        r25 = "audioList";
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x07df, code lost:
    
        if (r5 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x07e1, code lost:
    
        r4 = r41.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x07e3, code lost:
    
        if (r4 != null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x07e5, code lost:
    
        r16 = "audioListAdapter";
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x080e, code lost:
    
        r5.setAdapter(r4);
        r5 = r41.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0813, code lost:
    
        if (r5 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0815, code lost:
    
        X.AbstractC31174DnI.A17(requireContext(), r5, false);
        r6 = r41.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x081e, code lost:
    
        if (r6 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0820, code lost:
    
        r5 = requireContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0826, code lost:
    
        if (r41.A0Y == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0828, code lost:
    
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0829, code lost:
    
        r6.A10(new X.C51193Mjb(r5, r7));
        r5 = r41.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0833, code lost:
    
        if (r5 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0835, code lost:
    
        r5.setItemAnimator(new X.U7P());
        r4 = r41.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x083f, code lost:
    
        if (r4 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0841, code lost:
    
        r5 = r4.A0C;
        X.C14360o3.A0C(r5, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((X.C3F0) r5).A00 = false;
        requireContext();
        r6 = X.AbstractC166987dD.A0r(r2);
        r5 = r41.A0S;
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0857, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0859, code lost:
    
        r6 = X.AbstractC53929Nt2.A00(r6, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x085d, code lost:
    
        if (r6 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x085f, code lost:
    
        r5 = A01(r41);
        X.C57171PZp.A03(r6, r5, X.AbstractC141776au.A00(r5), 36);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x07ec, code lost:
    
        r12 = A01(r41);
        X.AbstractC53927Nt0.A00(r41, r12.A09, r12.A0A, null, X.C57522Pfw.A00(r12, 2), new X.C57744PjX(r12, 35));
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x086a, code lost:
    
        r7 = r41.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x086c, code lost:
    
        if (r7 == null) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x086e, code lost:
    
        r12 = r18.CVj();
        r41.A0C = r22;
        r6 = r22.A0A;
        r6.removeAllViews();
        r8 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0884, code lost:
    
        if (X.C2J9.A00 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x088f, code lost:
    
        if (X.C18U.A06(r2, r8, 36315451727940856L) == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0891, code lost:
    
        r8 = A00(r6, com.facebook.R.drawable.instagram_download_pano_outline_24, 2131972769, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x08a3, code lost:
    
        if (X.AbstractC43840Ja3.A00(X.AbstractC166987dD.A0r(r2)) == false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x08a5, code lost:
    
        r8.setColorFilter(X.AbstractC166997dE.A0N(r41).getColor(com.facebook.R.color.design_dark_default_color_on_background));
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x08b3, code lost:
    
        X.ViewOnClickListenerC55462OkH.A01(r8, 37, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x08bc, code lost:
    
        if (X.C50725MaQ.A02(r41) != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x08be, code lost:
    
        r5 = A00(r6, com.facebook.R.drawable.instagram_lux_pano_outline_24, 2131965821, false);
        X.C0fQ.A00(X.ViewOnClickListenerC55465OkK.A00(r5, r41, 3), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x08d4, code lost:
    
        if (A08() == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x08d8, code lost:
    
        if (r41.A0S == null) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x08de, code lost:
    
        if (X.C50725MaQ.A02(r41) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x08e4, code lost:
    
        if (X.AbstractC167007dF.A1Z(r4) == false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x08e6, code lost:
    
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x08e8, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x08ea, code lost:
    
        r5 = ((X.MX5) r4).A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x08f0, code lost:
    
        if (r5.A0I == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x08f4, code lost:
    
        if (r5.A0C == null) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0e2e, code lost:
    
        if (X.C36A.A09(X.AbstractC166987dD.A0r(r2)) == false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0e34, code lost:
    
        if (A0B(r41) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0e3a, code lost:
    
        if (X.C50725MaQ.A02(r41) != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0e3c, code lost:
    
        r5 = android.view.LayoutInflater.from(getThemedContext()).inflate(com.facebook.R.layout.media_edit_button, (android.view.ViewGroup) r6, false);
        X.C14360o3.A0C(r5, "null cannot be cast to non-null type android.widget.ImageView");
        r5 = (android.widget.ImageView) r5;
        r41.A06 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0e54, code lost:
    
        if (r5 == null) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0e56, code lost:
    
        A03(r5, r41, com.facebook.R.drawable.instagram_music_pano_outline_24);
        r6.addView(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x08fa, code lost:
    
        if (A0B(r41) == false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0900, code lost:
    
        if (X.C50725MaQ.A02(r41) != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0902, code lost:
    
        r5 = A00(r6, com.facebook.R.drawable.instagram_effects_pano_outline_24, 2131962565, false);
        r5.setId(com.facebook.R.id.feed_creation_filter_button);
        X.ViewOnClickListenerC55462OkH.A01(r5, 38, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x091b, code lost:
    
        if (A08() == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0923, code lost:
    
        if (X.AbstractC167007dF.A1Z(r41.A0g) != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0925, code lost:
    
        r8 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0935, code lost:
    
        if (X.C18U.A06(r2, r8, 36323049523587972L) == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x093b, code lost:
    
        if (X.C50725MaQ.A02(r41) != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x093d, code lost:
    
        r5 = A00(r6, com.facebook.R.drawable.instagram_photo_pano_outline_24, 2131963050, false);
        r5.setId(com.facebook.R.id.gallery_sticker_button);
        X.ViewOnClickListenerC55462OkH.A01(r5, 39, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0956, code lost:
    
        if (A08() == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x095e, code lost:
    
        if (X.AbstractC167007dF.A1Z(r41.A0g) != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0960, code lost:
    
        r8 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0970, code lost:
    
        if (X.C18U.A06(r2, r8, 36323049523522435L) == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0976, code lost:
    
        if (X.C50725MaQ.A02(r41) != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0978, code lost:
    
        r5 = A00(r6, com.facebook.R.drawable.instagram_sticker_pano_outline_24, 2131953231, false);
        r5.setId(com.facebook.R.id.feed_creation_asset_button);
        X.ViewOnClickListenerC55462OkH.A01(r5, 40, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0991, code lost:
    
        if (A08() == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0999, code lost:
    
        if (X.AbstractC167007dF.A1Z(r41.A0g) != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x099b, code lost:
    
        r8 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x09ab, code lost:
    
        if (X.C18U.A06(r2, r8, 36323049523391361L) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x09b1, code lost:
    
        if (X.C50725MaQ.A02(r41) != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x09b3, code lost:
    
        r9 = A00(r6, com.facebook.R.drawable.instagram_text_pano_filled_24, 2131975283, true);
        r9.setId(com.facebook.R.id.add_text_button);
        r8 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x09d3, code lost:
    
        if (X.C18U.A06(r2, r8, 36323049523850120L) == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x09e3, code lost:
    
        if (X.AbstractC166987dD.A0x(X.AbstractC166987dD.A0r(r2)).getBoolean("dismissed_feed_text_tool_badge", false) != false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x09e7, code lost:
    
        if ((r9 instanceof com.instagram.common.ui.base.IgSimpleImageView) == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x09e9, code lost:
    
        r4 = (com.instagram.common.ui.base.IgSimpleImageView) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x09ec, code lost:
    
        if (r4 == null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x09ee, code lost:
    
        r4.A05 = true;
        r4.invalidate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x09f5, code lost:
    
        if ((r9 instanceof com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x09f7, code lost:
    
        r5 = (com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x09fa, code lost:
    
        if (r5 == null) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x09fc, code lost:
    
        r5.A01.add(X.ViewOnClickListenerC55465OkK.A00(r9, r41, 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0a08, code lost:
    
        if (r5.A00 != null) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0a0a, code lost:
    
        r5.setOnClickListener(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0a0f, code lost:
    
        if (r12 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0a1e, code lost:
    
        if (X.C18U.A06(r2, X.AbstractC166987dD.A0r(r2), 36322413868230876L) == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0a20, code lost:
    
        r5 = A00(r6, com.facebook.R.drawable.instagram_filter_pano_filled_24, 2131963467, false);
        X.C0fQ.A00(X.ViewOnClickListenerC55459OkE.A00(r7, r5, r41, 14), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0a37, code lost:
    
        if (X.C50725MaQ.A02(r41) == false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0a39, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0a3e, code lost:
    
        if (X.C50725MaQ.A02(r41) == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0a40, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0a43, code lost:
    
        if (r41.A0Y == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0a49, code lost:
    
        if (X.AbstractC167007dF.A1Z(r4) != false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0a4b, code lost:
    
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0a4d, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0a55, code lost:
    
        if (X.MX5.A01(r4) != X.EnumC69983Ch.A02) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0a65, code lost:
    
        if (X.AbstractC166987dD.A1b(X.AbstractC43847JaB.A00(X.AbstractC166987dD.A0r(r2)).A03) == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0a67, code lost:
    
        r9 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0a77, code lost:
    
        if (X.C18U.A06(r2, r9, 36320390939419062L) == false) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0a79, code lost:
    
        r9 = X.AbstractC166997dE.A0S(r42, com.facebook.R.id.gallery_add_container);
        X.LBO.A00(requireActivity(), requireContext(), r41, A01(r41).A08, X.AbstractC166987dD.A0r(r2));
        r9.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0a9a, code lost:
    
        if (r41.A0Y == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0a9c, code lost:
    
        r27 = r42.requireViewById(com.facebook.R.id.creation_next_button);
        r12 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0aab, code lost:
    
        if (X.AbstractC167007dF.A1Z(r4) == false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0aad, code lost:
    
        r12.setButtonStyle(X.EnumC151036r4.A09);
        r12.setLabel(X.AbstractC166997dE.A0N(r41).getString(2131961124));
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0ac4, code lost:
    
        if (X.C50725MaQ.A02(r41) == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0ac6, code lost:
    
        r4 = r12.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0aca, code lost:
    
        if (r4 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0acc, code lost:
    
        r4 = (X.C56302iJ) r4;
        r4.A03 = 0.5f;
        r12.setLayoutParams(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0e77, code lost:
    
        throw X.AbstractC166987dD.A15(X.AbstractC111324zv.A00(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0ad5, code lost:
    
        X.ViewOnClickListenerC55462OkH.A01(r12, 36, r41);
        r2 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0adb, code lost:
    
        r6.setGravity(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0ae0, code lost:
    
        if (r41.A0Y == false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0ae2, code lost:
    
        r5 = X.AbstractC167007dF.A0M(r42, com.facebook.R.id.accept_reject_buttons_stub);
        r4 = X.AbstractC167007dF.A0M(r42, com.facebook.R.id.secondary_accept_buttons_stub);
        r5.setLayoutResource(com.facebook.R.layout.accept_reject_edit_buttons_v3);
        r4.setLayoutResource(com.facebook.R.layout.accept_reject_edit_buttons_v3);
        r41.A04 = r5.inflate();
        r4.inflate();
        r4 = r41.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0b04, code lost:
    
        if (r4 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0b06, code lost:
    
        r5 = X.AbstractC166997dE.A0S(r4, com.facebook.R.id.accept_buttons_container);
        X.ViewOnClickListenerC55462OkH.A01(r5.requireViewById(com.facebook.R.id.button_accept_adjust), 41, r41);
        X.ViewOnClickListenerC55462OkH.A01(r5.requireViewById(com.facebook.R.id.button_cancel_adjust), 42, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0b29, code lost:
    
        if (A0A(r41) == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0b2b, code lost:
    
        X.MSY.A0y(r5, com.facebook.R.id.button_change_audio_stub);
        r5 = r5.requireViewById(com.facebook.R.id.button_change_audio);
        r41.A00 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0b3a, code lost:
    
        if (r5 == null) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0b3c, code lost:
    
        r2 = new X.ViewOnClickListenerC55462OkH(r41, 43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0b43, code lost:
    
        X.C0fQ.A00(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0b46, code lost:
    
        if (r8 == null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0b48, code lost:
    
        X.ViewOnClickListenerC55462OkH.A01(r8, 32, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0b4d, code lost:
    
        if (r7 == null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0b4f, code lost:
    
        X.ViewOnClickListenerC55462OkH.A01(r7, 33, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0b54, code lost:
    
        if (r9 == null) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0b56, code lost:
    
        X.ViewOnClickListenerC55462OkH.A01(r9, 34, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0b5f, code lost:
    
        if (A08() == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0b67, code lost:
    
        if (X.AbstractC167007dF.A1Z(r41.A0g) != false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0b71, code lost:
    
        if (X.AbstractC50722MaN.A00(X.AbstractC166987dD.A0r(r2)) == false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0b73, code lost:
    
        X.MSY.A0y(requireView(), com.facebook.R.id.text_edit_tools_stub);
        r11 = X.AbstractC167017dG.A0U(requireView(), com.facebook.R.id.interactive_drawable_container_stub);
        X.C14360o3.A0C(r11, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.InteractiveDrawableContainer");
        r11 = (com.instagram.ui.widget.interactive.InteractiveDrawableContainer) r11;
        r6 = X.AbstractC166987dD.A0r(r2);
        r5 = X.AbstractC166997dE.A0N(r41).getDimensionPixelSize(com.facebook.R.dimen.trash_can_margin);
        X.C14360o3.A0B(r6, 0);
        r4 = r11.A0k;
        r2 = X.AbstractC31177DnL.A0G(r4);
        r2.bottomMargin = r5;
        r4.setLayoutParams(r2);
        r11.A0m.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0bb6, code lost:
    
        if (X.AbstractC43840Ja3.A00(r6) != false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0bb8, code lost:
    
        X.AbstractC31173DnH.A0z(r11.getContext(), r11.A0l, com.facebook.R.drawable.trash_can_with_circle_border_light_dark_mode);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0bc4, code lost:
    
        r11.A0R = true;
        r11.A0v(A01(r41));
        r11.setMarginAlignmentGuideEnabled(false);
        r41.A0T = r11;
        r4 = X.AbstractC166987dD.A0r(r2);
        r2 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0bd8, code lost:
    
        if (r2 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0bda, code lost:
    
        X.C57982lB.A0B.A05(requireActivity(), new X.RunnableC24789AyB(r19, r41, X.AbstractC55229Oez.A04(r4, r2, false).size()));
        r4 = requireView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0bf8, code lost:
    
        if ((r4 instanceof android.view.ViewGroup) == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0bfa, code lost:
    
        r4 = r4.findViewById(com.facebook.R.id.done_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0c01, code lost:
    
        if (r4 == null) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0c03, code lost:
    
        X.ViewOnClickListenerC55462OkH.A01(r4, 35, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0c08, code lost:
    
        A01(r41).A03().EUV(26, false);
        r2 = r41.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0c17, code lost:
    
        if (r2 == null) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0c19, code lost:
    
        r2.setVisibility(0);
        r2.A0O = true;
        r2.setLongPressEnabled(false);
        r4 = new X.C23728Af1(r2);
        r41.A0E = r4;
        r2 = new X.C8LK(requireContext(), X.AbstractC166987dD.A0r(r2), new X.C56248Oxv(), new X.C56249Oxw(r2), X.AbstractC31174DnI.A0z(r4));
        r41.A0D = r2;
        r18.EdA(new X.C55769Opd(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0c53, code lost:
    
        r41.A01 = requireActivity().findViewById(com.facebook.R.id.view_drag_overlay);
        X.JQ0.A11(r41, new X.C57162PZg(r41, r8, r27, r9, r22, r7, (X.InterfaceC23621Ds) null, 1), A01(r41).A0R);
        X.JQ0.A11(r41, X.PZV.A02(r41, null, 20), A01(r41).A0H);
        X.JQ0.A11(r41, new X.PZ3(r42, r18, r41, null, 15), A01(r41).A0P);
        X.JQ0.A11(r41, new X.MC7((X.InterfaceC23621Ds) null, r41, r9, 46), A01(r41).A0I);
        X.JQ0.A11(r41, X.PZV.A02(r41, null, 21), A01(r41).A0G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0cce, code lost:
    
        if (A0B(r41) == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0cd0, code lost:
    
        X.JQ0.A11(r41, X.PZV.A02(r41, null, 22), A01(r41).A0F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0ce1, code lost:
    
        X.JQ0.A11(r41, X.PZV.A02(r41, null, 23), A01(r41).A0J);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0cf6, code lost:
    
        if (A0A(r41) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0cf8, code lost:
    
        X.JQ0.A11(r41, new X.MC7((X.InterfaceC23621Ds) null, r41, r42, 47), A01(r41).A0Q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0d0e, code lost:
    
        if (X.AbstractC167007dF.A1Z(r4) == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0d10, code lost:
    
        r2 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0d12, code lost:
    
        if (r2 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0d14, code lost:
    
        r3 = ((X.MX5) r2).A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0d1a, code lost:
    
        if (r3.A0I == false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0d1e, code lost:
    
        if (r3.A0C == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0d20, code lost:
    
        X.AbstractC46696KlF.A00(requireContext(), X.AbstractC166987dD.A0r(r2), X.AbstractC31172DnG.A0s(A0B(r41)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0d33, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0d36, code lost:
    
        if (r41.A0d != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0d38, code lost:
    
        r3 = X.MX1.A01(X.AbstractC166987dD.A0r(r2));
        r2 = r41.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0d42, code lost:
    
        if (r2 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0d44, code lost:
    
        r5 = r2.A01.toString();
        X.C14360o3.A0B(r5, 0);
        X.MSX.A1K(r3.A0B, "PHOTO_FILTER_FRAGMENT_VIEW_CREATED : ", r5, r3.A06);
        r41.A0d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0d59, code lost:
    
        X.ViewOnClickListenerC55462OkH.A01(r22.requireViewById(com.facebook.R.id.button_accept_adjust), 44, r41);
        r5 = r22.requireViewById(com.facebook.R.id.button_cancel_adjust);
        r2 = new X.ViewOnClickListenerC55462OkH(r41, 45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0d79, code lost:
    
        r4 = r41.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0d7b, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0d83, code lost:
    
        if (X.MX5.A01(r4) != X.EnumC69983Ch.A05) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0d85, code lost:
    
        r11 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0d95, code lost:
    
        if (X.C18U.A06(r2, r11, 36328053160557633L) == false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0d97, code lost:
    
        r12.setLabel(X.AbstractC166997dE.A0N(r41).getString(2131961124));
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0da7, code lost:
    
        r11 = X.AbstractC166987dD.A0r(r2);
        X.C14360o3.A0B(r11, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0db7, code lost:
    
        if (X.C18U.A06(r2, r11, 36328946513624980L) != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0dc1, code lost:
    
        if (X.C8SO.A00(X.AbstractC166987dD.A0r(r2)) != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0dc3, code lost:
    
        r12.setEndAddOn(X.EnumC53232NgU.A05);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0dca, code lost:
    
        r12.setButtonStyle(X.EnumC151036r4.A09);
        r12.setEndAddOn(X.EnumC53232NgU.A06);
        r12.setLabel(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0ddb, code lost:
    
        r27 = X.AbstractC43841Ja4.A00(new X.ViewOnClickListenerC55462OkH(r41, 31), r22, r11, X.AbstractC167007dF.A1Z(r4));
        r2 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0df0, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0df6, code lost:
    
        if (r41.A0Y == false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0df8, code lost:
    
        r7 = r42.requireViewById(com.facebook.R.id.creation_filter_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0e01, code lost:
    
        r7 = A00(r6, com.facebook.R.drawable.filter_off, 2131962556, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0e0f, code lost:
    
        if (r41.A0Y == false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0e11, code lost:
    
        r8 = r42.requireViewById(com.facebook.R.id.creation_edit_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0e1a, code lost:
    
        r8 = A00(r6, com.facebook.R.drawable.tools_off, 2131961561, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x03d8, code lost:
    
        if (r8 == X.EnumC69983Ch.A05) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r42, android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 3704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50724MaP.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C50725MaQ A01(C50724MaP c50724MaP) {
        return (C50725MaQ) c50724MaP.A0k.getValue();
    }

    public static void A02(Context context, InterfaceC58189Pqv interfaceC58189Pqv, Integer num, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, new NHG(context, interfaceC58189Pqv, num));
    }

    public static final void A04(C81Y c81y, C50724MaP c50724MaP) {
        C183688Ct c183688Ct;
        int ordinal = ((EnumC53148Nf3) c50724MaP.A0h.getValue()).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        A07(c50724MaP);
                        return;
                    }
                    return;
                } else {
                    c81y.A00.A0d.A0z.A03();
                    A01(c50724MaP).A05();
                    return;
                }
            }
            C81Y c81y2 = c50724MaP.A0I;
            if (c81y2 != null && (c183688Ct = c81y2.A00.A0d) != null) {
                c183688Ct.A0z.A09();
            }
            A01(c50724MaP).A06();
            return;
        }
        AbstractC50522MSa.A1S(c50724MaP.A0I);
        if (c50724MaP.A0I == null) {
            return;
        }
        A01(c50724MaP).A04();
    }

    public static final void A05(C50724MaP c50724MaP) {
        ViewParent viewParent;
        if (c50724MaP.A0N == null) {
            UserSession A0r = AbstractC166987dD.A0r(c50724MaP.A0i);
            Context themedContext = c50724MaP.getThemedContext();
            CreationToolbarView creationToolbarView = c50724MaP.A0Q;
            if (creationToolbarView != null) {
                viewParent = creationToolbarView.getParent();
            } else {
                viewParent = null;
            }
            AbstractC43592JPx.A1T(viewParent);
            c50724MaP.A0N = new OXA(themedContext, (ViewGroup) viewParent, A0r);
        }
    }

    public static final void A06(C50724MaP c50724MaP) {
        C22P c22p;
        String str;
        LinearLayout linearLayout;
        MediaEditActionBar mediaEditActionBar = c50724MaP.A0C;
        if (mediaEditActionBar != null && (linearLayout = mediaEditActionBar.A0A) != null) {
            C12500ku c12500ku = new C12500ku(linearLayout);
            while (c12500ku.hasNext()) {
                MSW.A0A(c12500ku).setEnabled(false);
            }
        }
        c50724MaP.A0D();
        if (c50724MaP.getContext() != null) {
            C50725MaQ A01 = A01(c50724MaP);
            Context requireContext = c50724MaP.requireContext();
            C47Z c47z = c50724MaP.A0S;
            AnonymousClass840 anonymousClass840 = c50724MaP.A0F;
            if (anonymousClass840 == null) {
                str = "cameraSession";
            } else {
                InterfaceC58286Pse interfaceC58286Pse = c50724MaP.A0P;
                if (interfaceC58286Pse == null) {
                    str = "provider";
                } else {
                    C8LK c8lk = c50724MaP.A0D;
                    C0K8.A0C(__redex_internal_original_name, "Next button tapped, call MediaSaveHelper#saveAndFinish()");
                    UserSession userSession = A01.A09;
                    FA7.A00(userSession).A00(EnumC33422Ept.A07, C05F.A15);
                    AbstractC155496ye.A00(userSession).A05("photo_filter_confirmed");
                    MYZ myz = A01.A0B;
                    if (c47z != null) {
                        c22p = c47z.A0i;
                    } else {
                        c22p = null;
                    }
                    C24Q c24q = myz.A0B;
                    long A03 = c24q.A03(288435925, myz.A05);
                    myz.A05 = A03;
                    c24q.A0A(A03, "camera_destination", "feed");
                    if (c22p != null) {
                        c24q.A0A(myz.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
                    }
                    if (AbstractC50722MaN.A00(userSession)) {
                        AbstractC166987dD.A1Z(new PXy(requireContext, c8lk, A01, c47z, interfaceC58286Pse, anonymousClass840, __redex_internal_original_name, null, 0), AbstractC141776au.A00(A01));
                    } else {
                        AbstractC54875OOn.A00(requireContext, userSession, anonymousClass840, interfaceC58286Pse, A01.A0S);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC50522MSa.A1R(c50724MaP.A0H, c50724MaP);
    }

    private final boolean A08() {
        MediaUploadMetadata mediaUploadMetadata;
        AnonymousClass841 anonymousClass841 = this.A0G;
        String str = null;
        if (anonymousClass841 == null) {
            C14360o3.A0F("creationCameraSession");
            throw C00O.createAndThrow();
        }
        if (MX5.A01(anonymousClass841) == EnumC69983Ch.A02) {
            C47Z c47z = this.A0S;
            if (c47z != null && (mediaUploadMetadata = c47z.A13) != null) {
                str = mediaUploadMetadata.A03;
            }
            if ("com.instagram.barcelona".equals(str)) {
                UserSession A0r = AbstractC166987dD.A0r(this.A0i);
                C14360o3.A0B(A0r, 0);
                if (!C98J.A00(A0r).booleanValue()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final UserSession A0C() {
        return AbstractC166987dD.A0r(this.A0i);
    }

    @Override // X.InterfaceC185668Ll
    public final void Dr6(Surface surface, int i, int i2) {
        Rect A00;
        CropInfo cropInfo;
        C09530e4 A0o;
        FilterGroupModel A03;
        Object obj;
        String str;
        InterfaceC58286Pse interfaceC58286Pse = this.A0P;
        C55U c55u = null;
        if (interfaceC58286Pse == null) {
            str = "provider";
        } else {
            MXB mxb = ((MediaCaptureActivity) interfaceC58286Pse).A07;
            if (mxb != null) {
                if (!mxb.A03) {
                    mxb.A07.sendEmptyMessageDelayed(1, 1500L);
                }
                this.A0U = Integer.valueOf(Math.max(i, i2));
                C50725MaQ A01 = A01(this);
                C54763OHu c54763OHu = this.A0O;
                boolean z = this.A0b;
                UserSession userSession = A01.A09;
                if ((!C2J9.A02(userSession) || (!A01.A0S && !A01.A03)) && !z) {
                    A01.A03 = true;
                    SurfaceCropFilter A002 = A0R.A00(A01.A03(), "_onSurfaceTextureAvailable()");
                    if (A002 != null && c54763OHu != null) {
                        AnonymousClass841 anonymousClass841 = A01.A0A;
                        CreationSession creationSession = ((MX5) anonymousClass841).A01;
                        int A012 = creationSession.A01();
                        int A003 = creationSession.A00();
                        int ATe = anonymousClass841.ATe();
                        PhotoSession A02 = creationSession.A02();
                        if (A02 == null || (cropInfo = A02.A05) == null || (A00 = cropInfo.A02) == null || A00.right > A012 || A00.bottom > A003) {
                            C5L6 ANZ = anonymousClass841.ANZ();
                            A00 = MX2.A00(ANZ.A00, A012, A003, ATe, ANZ.A03);
                        }
                        A002.A0K(A00, A012, A003, ATe, false);
                        c54763OHu.A00(anonymousClass841.ANZ(), A002, anonymousClass841.E4J());
                    }
                }
                boolean A032 = C2J9.A03(userSession);
                C38688GzT c38688GzT = A01.A00;
                if (A032) {
                    obj = C50725MaQ.A00(A01.A0A.ANZ(), A01, i);
                    A0o = AbstractC167007dF.A0o(Integer.valueOf(i), i2);
                    A03 = A01.A03();
                } else {
                    A0o = AbstractC167007dF.A0o(Integer.valueOf(i), i2);
                    A03 = A01.A03();
                    obj = c38688GzT.A03;
                }
                C38688GzT c38688GzT2 = new C38688GzT(9, c38688GzT.A00, A0o, obj, A03);
                A01.A00 = c38688GzT2;
                A01.A0C.F8s(c38688GzT2);
                InteractiveDrawableContainer interactiveDrawableContainer = this.A0T;
                if (interactiveDrawableContainer != null) {
                    C50725MaQ A013 = A01(this);
                    Context requireContext = requireContext();
                    C47Z c47z = this.A0S;
                    int width = interactiveDrawableContainer.getWidth();
                    int height = interactiveDrawableContainer.getHeight();
                    AnonymousClass840 anonymousClass840 = this.A0F;
                    if (anonymousClass840 == null) {
                        str = "cameraSession";
                    } else {
                        C1810981l c1810981l = anonymousClass840.A02.A01.A0Y;
                        if (c1810981l != null) {
                            c55u = (C55U) c1810981l.A08.A00;
                        }
                        AbstractC166987dD.A1Z(new PYk(requireContext, c55u, A013, c47z, "photo_filter", null, width, height), AbstractC141776au.A00(A013));
                    }
                }
                C81Y c81y = this.A0I;
                if (c81y != null) {
                    A04(c81y, this);
                }
                this.A0X.set(true);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0i);
    }

    public C50724MaP() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0j = AbstractC09440dt.A00(enumC09460dv, C57522Pfw.A00(this, 0));
        this.A0g = AbstractC09440dt.A00(enumC09460dv, new C57242PbQ(this, 35));
        this.A0h = AbstractC09440dt.A00(enumC09460dv, new C50253MHi(EnumC53148Nf3.NONE, this, "default_open_tool", 40));
        this.A0X = new AtomicBoolean(false);
        this.A0Y = true;
        C57522Pfw A00 = C57522Pfw.A00(this, 1);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C57242PbQ(new C57242PbQ(this, 44), 45));
        this.A0k = AbstractC25225BEi.A0a(new C57242PbQ(A002, 46), A00, MSW.A1G(A002, null, 4), AbstractC25225BEi.A1D(C50725MaQ.class));
        C16930sl c16930sl = C16930sl.A00;
        this.A0V = c16930sl;
        this.A0a = c16930sl;
        this.A0e = AbstractC167017dG.A0j();
        C57242PbQ c57242PbQ = new C57242PbQ(this, 34);
        InterfaceC09390do A003 = AbstractC09440dt.A00(enumC09460dv, new C57242PbQ(new C57242PbQ(this, 47), 48));
        this.A0f = AbstractC25225BEi.A0a(new C57242PbQ(A003, 49), c57242PbQ, MSW.A1G(A003, null, 5), AbstractC25225BEi.A1D(C50930Mez.class));
    }

    private final ImageView A00(ViewGroup viewGroup, int i, int i2, boolean z) {
        LayoutInflater from = LayoutInflater.from(getThemedContext());
        int i3 = R.layout.media_edit_button;
        if (z) {
            i3 = R.layout.multi_listener_media_edit_button;
        }
        View A0A = AbstractC31172DnG.A0A(from, viewGroup, i3);
        C14360o3.A0C(A0A, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) A0A;
        imageView.setImageResource(i);
        imageView.setContentDescription(getString(i2));
        AbstractC56832jG.A00(imageView, getThemedContext().getColor(AbstractC53242c7.A08(getThemedContext())), AbstractC31173DnH.A03(getThemedContext(), getThemedContext(), R.attr.igds_color_creation_tools_blue), 255);
        viewGroup.addView(imageView);
        return imageView;
    }

    public static final void A07(C50724MaP c50724MaP) {
        String str;
        A05(c50724MaP);
        OXA oxa = c50724MaP.A0N;
        if (oxa != null) {
            List list = c50724MaP.A0a;
            FilterViewContainer filterViewContainer = c50724MaP.A0B;
            if (filterViewContainer == null) {
                str = "filterViewContainer";
            } else {
                Integer num = C05F.A01;
                C56240Oxn c56240Oxn = new C56240Oxn(filterViewContainer, c50724MaP, num);
                InterfaceC58288Psg interfaceC58288Psg = c50724MaP.A0J;
                if (interfaceC58288Psg == null) {
                    str = "imageRenderControllerManager";
                } else {
                    FilterGroupModel A03 = A01(c50724MaP).A03();
                    C57242PbQ c57242PbQ = new C57242PbQ(c50724MaP, 39);
                    C57242PbQ c57242PbQ2 = new C57242PbQ(c50724MaP, 40);
                    AbstractC167007dF.A1E(list, 0, A03);
                    C56273Oyi c56273Oyi = oxa.A01;
                    if (c56273Oyi == null) {
                        c56273Oyi = new C56273Oyi(oxa.A05, new P03(c56240Oxn, interfaceC58288Psg, oxa, A03, list, c57242PbQ, c57242PbQ2));
                        oxa.A01 = c56273Oyi;
                    }
                    oxa.A07.A00 = num;
                    BottomSheetViewController bottomSheetViewController = oxa.A06;
                    bottomSheetViewController.A03 = c56273Oyi;
                    bottomSheetViewController.A02();
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final boolean A09(View view, InterfaceC58189Pqv interfaceC58189Pqv, FilterViewContainer filterViewContainer, C50724MaP c50724MaP, boolean z) {
        FilterGroupModel A03 = A01(c50724MaP).A03();
        InterfaceC58288Psg interfaceC58288Psg = c50724MaP.A0J;
        if (interfaceC58288Psg == null) {
            C14360o3.A0F("imageRenderControllerManager");
            throw C00O.createAndThrow();
        }
        boolean DkF = interfaceC58189Pqv.DkF(view, filterViewContainer, interfaceC58288Psg, A03);
        if (DkF && z) {
            A01(c50724MaP).A08(interfaceC58189Pqv, false);
        }
        return DkF;
    }

    public static final boolean A0A(C50724MaP c50724MaP) {
        C47Z c47z;
        if (c50724MaP.A08() && !AbstractC167007dF.A1Z(c50724MaP.A0j) && ((c47z = c50724MaP.A0S) == null || c47z.A1J == null)) {
            UserSession A0r = AbstractC166987dD.A0r(c50724MaP.A0i);
            C14360o3.A0B(A0r, 0);
            if (C36A.A09(A0r) && C18U.A06(C06090Tz.A05, A0r, 36326223504226042L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0B(C50724MaP c50724MaP) {
        if (c50724MaP.A08() && !AbstractC167007dF.A1Z(c50724MaP.A0j) && C36A.A0B(AbstractC166987dD.A0r(c50724MaP.A0i)) && !C50725MaQ.A02(c50724MaP)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, com.instagram.model.people.PeopleTag, com.instagram.tagging.model.Tag] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, X.5QB] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A0D() {
        C5QB c5qb;
        ?? r9;
        ArrayList arrayList;
        C5NL c5nl;
        C5QK c5qk;
        C5QL c5ql;
        C202858y3 c202858y3;
        C5NL c5nl2;
        C217889kL c217889kL;
        User user;
        PhotoSession A02;
        C183688Ct c183688Ct;
        C50725MaQ A01 = A01(this);
        C81Y c81y = this.A0I;
        if (c81y != null && (c183688Ct = c81y.A00.A0d) != null) {
            C203298ym c203298ym = new C203298ym(new C199008r1(c183688Ct.A0R(), null, null, null, false));
            List list = c203298ym.A03;
            C5QD c5qd = c203298ym.A02;
            int i = c203298ym.A00;
            ?? obj = new Object();
            obj.A02 = list;
            obj.A01 = c5qd;
            obj.A00 = i;
            c5qb = obj;
        } else {
            c5qb = null;
        }
        C47Z c47z = this.A0S;
        UserSession userSession = A01.A09;
        if (C18U.A06(C06090Tz.A05, userSession, 36323049523391361L) && (A02 = ((MX5) A01.A0A).A01.A02()) != null) {
            A02.A06 = c5qb;
        }
        if (C18U.A06(C06090Tz.A06, userSession, 36323049523981194L) && c5qb != null) {
            List<C203318yo> list2 = c5qb.A02;
            Iterable iterable = null;
            if (list2 != null) {
                r9 = AbstractC166987dD.A1E();
                for (C203318yo c203318yo : list2) {
                    C5NM c5nm = c203318yo.A00;
                    if (c5nm != null) {
                        c5nl2 = c5nm.A00();
                    } else {
                        c5nl2 = null;
                    }
                    if ((c5nl2 instanceof C217889kL) && (c217889kL = (C217889kL) c5nl2) != null && (user = c217889kL.A03) != null) {
                        AbstractC166997dE.A1R(user, c203318yo.A02, r9);
                    }
                }
            } else {
                r9 = 0;
            }
            List<C203318yo> list3 = c5qb.A02;
            if (list3 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                for (C203318yo c203318yo2 : list3) {
                    C5NM c5nm2 = c203318yo2.A00;
                    if (c5nm2 != null) {
                        c5nl = c5nm2.A00();
                    } else {
                        c5nl = null;
                    }
                    if ((c5nl instanceof C5QK) && (c5qk = (C5QK) c5nl) != null && (c5ql = c5qk.A0D) != null) {
                        List list4 = c5ql.A01;
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        for (Object obj2 : list4) {
                            if (((C5QO) obj2).A00() == C05F.A0N) {
                                A1E2.add(obj2);
                            }
                        }
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        Iterator it = A1E2.iterator();
                        while (it.hasNext()) {
                            Object A022 = WE0.A02(null, (C5QO) it.next(), false);
                            if ((A022 instanceof C202858y3) && (c202858y3 = (C202858y3) A022) != null) {
                                AbstractC166997dE.A1R(c202858y3.A00, c203318yo2.A02, A1E3);
                            }
                        }
                        A1E.add(A1E3);
                    }
                }
                iterable = AbstractC06950Ym.A1F(A1E);
            }
            if (r9 == 0) {
                r9 = C16930sl.A00;
            }
            if (iterable == null) {
                iterable = C16930sl.A00;
            }
            ArrayList A0S = AbstractC001800i.A0S(iterable, r9);
            ArrayList A0q = AbstractC167017dG.A0q(A0S);
            Iterator it2 = A0S.iterator();
            while (it2.hasNext()) {
                C09530e4 A17 = AbstractC43592JPx.A17(it2);
                User user2 = (User) A17.A00;
                C202278x7 c202278x7 = (C202278x7) A17.A01;
                float f = 0.0f;
                if (c202278x7 != null) {
                    float f2 = c202278x7.A01;
                    float f3 = c202278x7.A03;
                    if (Float.valueOf(f3) != null) {
                        f = (f2 / (f3 - f2)) / 2.0f;
                    }
                }
                float f4 = f + 0.5f;
                float f5 = 0.0f;
                if (c202278x7 != null) {
                    float f6 = c202278x7.A02;
                    float f7 = c202278x7.A04;
                    if (Float.valueOf(f7) != null) {
                        f5 = (f6 / (f7 - f6)) / 2.0f;
                    }
                }
                PointF pointF = new PointF(f4, f5 + 0.5f);
                ?? obj3 = new Object();
                obj3.A03 = false;
                obj3.A00 = pointF;
                obj3.A00 = new PeopleTag.UserInfo(user2);
                obj3.A03 = true;
                A0q.add(obj3);
            }
            if (!A0q.isEmpty()) {
                if (c47z != null) {
                    arrayList = c47z.A40;
                } else {
                    arrayList = null;
                }
                ArrayList A1F = AbstractC166987dD.A1F(A0q);
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator A13 = AbstractC166997dE.A13(arrayList);
                    while (A13.hasNext()) {
                        PeopleTag peopleTag = (PeopleTag) AbstractC166997dE.A0l(A13);
                        if (!peopleTag.A03) {
                            A1F.add(peopleTag);
                        }
                    }
                }
                ArrayList A1E4 = AbstractC166987dD.A1E();
                ArrayList A1E5 = AbstractC166987dD.A1E();
                Iterator it3 = A1F.iterator();
                while (it3.hasNext()) {
                    PeopleTag peopleTag2 = (PeopleTag) it3.next();
                    if (!A1E4.contains(peopleTag2.A00.A04)) {
                        A1E5.add(peopleTag2);
                        String str = peopleTag2.A00.A04;
                        C14360o3.A07(str);
                        A1E4.add(str);
                    }
                }
                if (c47z != null) {
                    ArrayList A1E6 = AbstractC166987dD.A1E();
                    AnonymousClass016.A16(A1E5, A1E6);
                    C14360o3.A0B(A1E6, 0);
                    c47z.A40 = A1E6;
                }
            }
        }
    }

    @Override // X.InterfaceC58141Pq6
    public final void DC0(View view, boolean z) {
        Object value;
        C50726MaR c50726MaR;
        C05A c05a = A01(this).A0M;
        do {
            value = c05a.getValue();
            c50726MaR = (C50726MaR) value;
        } while (!c05a.AIi(value, C50726MaR.A00((Integer) c50726MaR.A02, (Integer) c50726MaR.A01, c50726MaR.A03, false, c50726MaR.A05)));
    }

    @Override // X.InterfaceC58141Pq6
    public final void DC7(View view, float f, float f2) {
        Object value;
        C50726MaR c50726MaR;
        C05A c05a = A01(this).A0M;
        do {
            value = c05a.getValue();
            c50726MaR = (C50726MaR) value;
        } while (!c05a.AIi(value, C50726MaR.A00((Integer) c50726MaR.A02, (Integer) c50726MaR.A01, c50726MaR.A03, true, c50726MaR.A05)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0106, code lost:
    
        if (r1 != r3.ANZ()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (r0.getInteractiveDrawables().size() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0124, code lost:
    
        if (r1.A0A(null, X.C05F.A0Y) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
    
        r3 = A01(r10);
        r5 = r3.A0A;
        r2 = ((X.MX5) r5).A01;
        r1 = r2.A02();
        r1.getClass();
        r0 = r1.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013a, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        r1.A07 = r0.E3K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0142, code lost:
    
        r0 = r2.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0146, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
    
        r0 = r0.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014c, code lost:
    
        X.AbstractC197358o6.A02(r0.A02, r3.A03(), r2.A01(), r2.A00(), r5.ATe());
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0161, code lost:
    
        r3 = X.C6WI.A01();
        r2 = r10.A0i;
        r3.A07(X.AbstractC166987dD.A0r(r2), "edit_carousel", false);
        X.AbstractC43593JPy.A1P(X.AbstractC166987dD.A0r(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0177, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
    
        if (r1.A0A(null, X.C05F.A0N) == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50724MaP.onBackPressed():boolean");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        Object value;
        C50726MaR c50726MaR;
        Window A0H;
        String str;
        int A02 = C0f9.A02(232070288);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0i;
        if (AbstractC43840Ja3.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            setDayNightMode(EnumC60792q3.A03);
        }
        this.mLifecycleRegistry.A09(A01(this));
        this.A0O = new C54763OHu();
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.pendingmedia.model.PendingMediaProvider");
        InterfaceC189598ae interfaceC189598ae = (InterfaceC189598ae) requireActivity;
        AnonymousClass841 anonymousClass841 = this.A0G;
        if (anonymousClass841 == null) {
            str = "creationCameraSession";
        } else {
            this.A0S = interfaceC189598ae.BcC(anonymousClass841.E3z());
            AbstractC53982Ntt.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(requireContext(), this.A0S);
            FA7.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(EnumC33422Ept.A07, C05F.A0u);
            AbstractC155496ye.A00(AbstractC166987dD.A0r(interfaceC09390do)).A05("photo_filter_fragment_loaded");
            if (A0B(this)) {
                num = C05F.A0N;
            } else if (C50725MaQ.A02(this)) {
                num = C05F.A0Y;
            } else {
                num = C05F.A00;
            }
            C05A c05a = A01(this).A0M;
            do {
                value = c05a.getValue();
                c50726MaR = (C50726MaR) value;
            } while (!c05a.AIi(value, C50726MaR.A00(num, num, c50726MaR.A03, c50726MaR.A04, c50726MaR.A05)));
            C50713MaC.A00(AbstractC166987dD.A0r(interfaceC09390do)).A09(false);
            C55105ObK A00 = C50713MaC.A00(AbstractC166987dD.A0r(interfaceC09390do));
            requireContext();
            AnonymousClass840 anonymousClass840 = this.A0F;
            if (anonymousClass840 == null) {
                str = "cameraSession";
            } else {
                A00.A08(anonymousClass840);
                this.A0b = requireArguments().getBoolean("is_from_external_photo_share", false);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                if (C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36323049523391361L) && (A0H = AbstractC31174DnI.A0H(this)) != null) {
                    A0H.setSoftInputMode(48);
                }
                C0f9.A09(-1568808624, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(704898647);
        C14360o3.A0B(layoutInflater, 0);
        boolean A04 = AbstractC43841Ja4.A04(requireContext());
        this.A0Y = A04;
        int i = R.layout.fragment_filter_small;
        if (A04) {
            i = R.layout.fragment_filter_v2;
        }
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false);
        C0f9.A09(-364097129, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1984027913);
        super.onDestroyView();
        A01(this).A09(false);
        C47811L9t c47811L9t = this.A0L;
        if (c47811L9t != null) {
            c47811L9t.A01.A07.A0F();
        }
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = this.A0A;
        if (viewOnClickListenerC44797JsK != null) {
            viewOnClickListenerC44797JsK.A02 = null;
            viewOnClickListenerC44797JsK.setAdapter(null);
        }
        this.A0A = null;
        this.A06 = null;
        InterfaceC678133v interfaceC678133v = this.A0R;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
        this.A0C = null;
        this.A09 = null;
        this.A0Q = null;
        this.A0N = null;
        InterfaceC09390do interfaceC09390do = this.A0i;
        if (AbstractC50722MaN.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            A01(this).A03().EUV(26, true);
            C81Y c81y = this.A0I;
            if (c81y != null) {
                C81Z c81z = c81y.A00;
                c81z.A0u.A09.removeView(c81z.A0T);
            }
        }
        String str = "creationCameraSession";
        if (C2J9.A03(AbstractC166987dD.A0r(interfaceC09390do))) {
            AnonymousClass841 anonymousClass841 = this.A0G;
            if (anonymousClass841 != null) {
                CreationSession creationSession = ((MX5) anonymousClass841).A01;
                if (creationSession.A07 != null && anonymousClass841.CPp()) {
                    creationSession.A0F = true;
                }
                InterfaceC58288Psg interfaceC58288Psg = this.A0J;
                if (interfaceC58288Psg == null) {
                    str = "imageRenderControllerManager";
                } else {
                    interfaceC58288Psg.AP4();
                    C0f9.A09(-1475935619, A02);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        boolean z = ((FilterGroupModelImpl) A01(this).A03()).A04;
        AnonymousClass841 anonymousClass8412 = this.A0G;
        if (anonymousClass8412 != null) {
            CreationSession creationSession2 = ((MX5) anonymousClass8412).A01;
            if (creationSession2.A07 != null) {
                if (anonymousClass8412.CPp()) {
                    if (!z) {
                        creationSession2.A0F = true;
                    }
                } else {
                    InterfaceC58286Pse interfaceC58286Pse = this.A0P;
                    if (interfaceC58286Pse == null) {
                        str = "provider";
                    } else {
                        String E4J = anonymousClass8412.E4J();
                        MXA mxa = ((MediaCaptureActivity) interfaceC58286Pse).A08;
                        mxa.getClass();
                        mxa.A0A.remove(E4J);
                    }
                }
            }
            C0f9.A09(-1475935619, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1862588286);
        super.onPause();
        C72133Lm.A03.A02(getActivity(), AbstractC166987dD.A0r(this.A0i));
        InterfaceC58189Pqv interfaceC58189Pqv = (InterfaceC58189Pqv) C51756Mtf.A01(this);
        if (interfaceC58189Pqv != null) {
            interfaceC58189Pqv.onPause();
        }
        InterfaceC678133v interfaceC678133v = this.A0R;
        if (interfaceC678133v != null && interfaceC678133v.isPlaying()) {
            InterfaceC678133v interfaceC678133v2 = this.A0R;
            if (interfaceC678133v2 != null) {
                interfaceC678133v2.pause();
            }
            this.A0c = true;
        }
        C0f9.A09(442776641, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2057623114);
        super.onResume();
        C72133Lm.A03.A03(getActivity(), AbstractC166987dD.A0r(this.A0i));
        C81Y c81y = this.A0I;
        if (c81y != null) {
            c81y.A01();
        }
        if (this.A0c && !this.A0Z) {
            InterfaceC678133v interfaceC678133v = this.A0R;
            if (interfaceC678133v != null) {
                interfaceC678133v.E4S();
            }
            this.A0c = false;
        }
        C0f9.A09(-669022180, A02);
    }
}

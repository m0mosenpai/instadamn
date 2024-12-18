package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.7zo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180607zo extends C2UU {
    public List A00;
    public final UserSession A01;
    public final C13480ma A02;
    public final InterfaceC16620sF A03;
    public final Map A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C180607zo(UserSession userSession, List list, Map map, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(map, 3);
        this.A01 = userSession;
        this.A00 = list;
        this.A04 = map;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A03 = interfaceC16620sF;
        this.A02 = new C13480ma(new Handler(Looper.getMainLooper()), new InterfaceC13380mO() { // from class: X.7zp
            @Override // X.InterfaceC13380mO
            public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
                C09530e4 c09530e4 = (C09530e4) obj;
                C14360o3.A0B(c09530e4, 0);
                int intValue = ((Number) c09530e4.A00).intValue();
                Object obj2 = c09530e4.A01;
                C180607zo c180607zo = C180607zo.this;
                c180607zo.A03.invoke(c180607zo.A00.get(intValue), obj2);
            }
        });
    }

    @Override // X.C2UU
    public final void onBindViewHolder(final C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C180677zv c180677zv = (C180677zv) c3oo;
        C180447zY c180447zY = (C180447zY) this.A00.get(i);
        UserSession userSession = this.A01;
        C14360o3.A0B(c180677zv, 0);
        C14360o3.A0B(c180447zY, 1);
        c180447zY.A00(userSession, c180677zv);
        View view = c180677zv.A04;
        C3P9 c3p9 = new C3P9(view);
        c3p9.A04 = new C3PD() { // from class: X.7zx
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C180677zv c180677zv2 = (C180677zv) C3OO.this;
                int bindingAdapterPosition = c180677zv2.getBindingAdapterPosition();
                boolean z = false;
                if (c180677zv2.A09.CGb() == 0) {
                    z = true;
                }
                if (bindingAdapterPosition != -1) {
                    final C13480ma c13480ma = this.A02;
                    final C09530e4 c09530e4 = new C09530e4(Integer.valueOf(bindingAdapterPosition), Boolean.valueOf(z));
                    if ((!c09530e4.equals(c13480ma.A01)) || System.currentTimeMillis() - c13480ma.A00 > 500) {
                        c13480ma.A00 = System.currentTimeMillis();
                        c13480ma.A01 = c09530e4;
                        Handler handler = c13480ma.A02;
                        handler.post(new Runnable() { // from class: X.0mY
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13480ma.this.A03.onDebouncedValue(c09530e4);
                            }
                        });
                        handler.postDelayed(new Runnable() { // from class: X.0mZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C13480ma.this.A01 = null;
                            }
                        }, 500L);
                    }
                }
                return true;
            }
        };
        c3p9.A07 = true;
        c3p9.A00();
        AbstractC56952jT.A04(view, C05F.A01);
        C5SU c5su = (C5SU) this.A04.get(((C180447zY) this.A00.get(i)).A00);
        if (c5su != null) {
            view.postDelayed(new RunnableC24766Axo(c3oo, this, c5su), 500L);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        double d;
        C14360o3.A0B(viewGroup, 0);
        boolean z = this.A07;
        Context context = viewGroup.getContext();
        if (z) {
            C14360o3.A07(context);
            View inflate = LayoutInflater.from(context).inflate(R.layout.gallery_destination_item_short, viewGroup, false);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C14360o3.A0A(inflate);
            return new C180677zv(inflate, dimensionPixelSize);
        }
        C14360o3.A07(context);
        boolean z2 = this.A06;
        boolean z3 = this.A05;
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.gallery_destination_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
        C14360o3.A07(layoutParams);
        if (z2) {
            if (z3) {
                d = 3.75d;
            } else {
                d = 3.5d;
            }
            layoutParams.width = (int) ((AbstractC13890nF.A01(context) - (Math.ceil(d) * context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material))) / d);
        }
        if (z3) {
            Resources resources = context.getResources();
            if (resources != null) {
                layoutParams.height = resources.getDimensionPixelOffset(R.dimen.direct_standard_xma_grid_view_height);
            }
            Resources resources2 = context.getResources();
            if (resources2 != null) {
                int dimensionPixelOffset = resources2.getDimensionPixelOffset(R.dimen.achievements_only_you_top_margin);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = dimensionPixelOffset;
                marginLayoutParams.bottomMargin = dimensionPixelOffset;
            }
        }
        inflate2.setLayoutParams(layoutParams);
        return new C180677zv(inflate2, 0);
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        TextView textView;
        ViewGroup viewGroup;
        C14360o3.A0B(c3oo, 0);
        C180677zv c180677zv = (C180677zv) c3oo;
        C14360o3.A0B(c180677zv, 0);
        AnonymousClass808 anonymousClass808 = c180677zv.A00;
        if (anonymousClass808 != null) {
            ((Animator) anonymousClass808.A0C.getValue()).cancel();
        }
        c180677zv.A00 = null;
        View view = c180677zv.A04;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.setClipChildren(true);
            viewGroup.setClipToPadding(true);
            viewGroup.setTranslationZ(0.0f);
        }
        IgSimpleImageView igSimpleImageView = c180677zv.A07;
        igSimpleImageView.setScaleType(c180677zv.A05);
        igSimpleImageView.getLayoutParams().width = c180677zv.A02;
        IgTextView igTextView = c180677zv.A08;
        ViewGroup.LayoutParams layoutParams = igTextView.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = -2;
        layoutParams.height = -2;
        igTextView.setLayoutParams(layoutParams);
        igTextView.setTextSize(0, c180677zv.A01);
        InterfaceC56392iX interfaceC56392iX = c180677zv.A09;
        if (interfaceC56392iX.CWW() && (textView = (TextView) interfaceC56392iX.getView()) != null) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            textView.setLayoutParams(layoutParams2);
            textView.setTextSize(2, 8.0f);
            textView.setBackgroundResource(R.drawable.badge_background_round_rect);
        }
    }

    public final void A00(List list) {
        this.A00 = list;
        notifyDataSetChanged();
        for (Object obj : this.A00) {
            if (((C180447zY) obj).A00 == EnumC180417zV.A04) {
                if (obj != null) {
                    C22C A01 = AnonymousClass229.A01(this.A01);
                    C81X c81x = C81X.A1a;
                    C18920wW c18920wW = ((C22F) A01).A01;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_gallery_tool_impression");
                    if (A00.isSampled()) {
                        A00.A8p("event_type", 1);
                        A00.A8p("entity_type", 3);
                        C22M c22m = ((C22F) A01).A04;
                        A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        A00.A8R(A01.A0J(), "camera_destination");
                        A00.AAP("camera_session_id", c22m.A0L);
                        A00.A8R(c81x, "camera_tool");
                        A00.A8R(EnumC50631MWs.A0J, "surface");
                        A00.AAP("module", C22F.A08.getModuleName());
                        A00.AAP("composition_str_id", c22m.A0M);
                        A00.A8R(c22m.A0A, "composition_media_type");
                        A00.AAP("nav_chain", C1QM.A00.A02.A00);
                        A00.Cht();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1521989261);
        int size = this.A00.size();
        C0f9.A0A(-1625506641, A03);
        return size;
    }
}

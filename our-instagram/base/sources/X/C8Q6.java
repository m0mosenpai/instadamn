package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.widget.colourwheel.ColourWheelView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Q6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Q6 {
    public RecyclerView A00;
    public C8QA A01;
    public AnonymousClass840 A02;
    public C9U4 A03;
    public C8DM A04;
    public EnumC1810181d A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public C89P A0C;
    public EnumC1810381f A0D;
    public boolean A0E;
    public boolean A0F;
    public final Context A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final View A0N;
    public final View A0O;
    public final ViewGroup A0P;
    public final ViewGroup A0Q;
    public final ImageView A0R;
    public final ImageView A0S;
    public final ImageView A0T;
    public final ImageView A0U;
    public final ImageView A0V;
    public final ImageView A0W;
    public final ImageView A0X;
    public final ImageView A0Y;
    public final ImageView A0Z;
    public final ImageView A0a;
    public final ImageView A0b;
    public final ProgressBar A0c;
    public final ProgressBar A0d;
    public final AnonymousClass693 A0e;
    public final UserSession A0f;
    public final InterfaceC56392iX A0g;
    public final InterfaceC56392iX A0h;
    public final InterfaceC56392iX A0i;
    public final InterfaceC56392iX A0j;
    public final InterfaceC56392iX A0k;
    public final InterfaceC56392iX A0l;
    public final InterfaceC56392iX A0m;
    public final InterfaceC56392iX A0n;
    public final InterfaceC56392iX A0o;
    public final InterfaceC56392iX A0p;
    public final InterfaceC56392iX A0q;
    public final C8Q4 A0r;
    public final C8DN A0s;
    public final C184698Hk A0t;
    public final AnonymousClass856 A0u;
    public final C183608Cl A0v;
    public final C8QJ A0w;
    public final ColourWheelView A0x;
    public final WeakReference A0y;
    public final ArrayList A0z;
    public final InterfaceC09390do A10;
    public final InterfaceC09390do A11;
    public final InterfaceC09390do A12;
    public final InterfaceC09390do A13;
    public final InterfaceC09390do A14;
    public final InterfaceC09390do A15;
    public final InterfaceC09390do A16;
    public final InterfaceC09390do A17;
    public final boolean A18;
    public final boolean A19;
    public final View.OnTouchListener A1A;
    public final C1819485e A1B;
    public final C1810981l A1C;
    public final C1828989k A1D;
    public final InterfaceC09390do A1E;
    public final boolean A1F;

    public static final Drawable A00(C8Q6 c8q6) {
        ImageUrl imageUrl;
        MusicOverlayStickerModel A0T = c8q6.A0r.A00.A0T();
        if (A0T != null && (imageUrl = A0T.A03) != null) {
            if (C18U.A06(C06090Tz.A05, c8q6.A0f, 36325957216384545L)) {
                Context context = c8q6.A0G;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                BOM bom = new BOM(context, null, dimensionPixelSize, dimensionPixelSize / 2, context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), context.getColor(R.color.audio_bar_action_color_enabled), 1, -1, false);
                bom.A04(imageUrl, null);
                return bom;
            }
        }
        return c8q6.A0G.getDrawable(R.drawable.instagram_music_pano_outline_24);
    }

    public static final List A01(C8Q6 c8q6) {
        Boolean A00;
        UserSession userSession = c8q6.A0f;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 2342162897643511554L)) {
            return C16930sl.A00;
        }
        List A1Q = AbstractC16960so.A1Q(EnumC193878i8.A0B, EnumC193878i8.A09);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A1Q) {
            EnumC193878i8 enumC193878i8 = (EnumC193878i8) obj;
            C14360o3.A0B(enumC193878i8, 1);
            int ordinal = enumC193878i8.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        A00 = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36329410369962308L));
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    A00 = AbstractC197498oK.A00(userSession);
                }
            } else {
                A00 = AbstractC197508oL.A00(userSession);
            }
            if (A00.booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void A02(View view, C8Q6 c8q6) {
        ImageView imageView = c8q6.A0S;
        if (imageView.getVisibility() == 0) {
            C8QC.A05(new View[]{imageView}, false);
        }
        AnonymousClass229.A01(c8q6.A0f).A01.A00();
        c8q6.A0s.A03();
        if (c8q6.A18) {
            view.performClick();
        }
    }

    public static final void A03(final C8Q6 c8q6) {
        InterfaceC56392iX interfaceC56392iX = c8q6.A0k;
        if (interfaceC56392iX.CWW()) {
            C8QC.A05(new View[]{interfaceC56392iX.getView()}, false);
        }
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131961681);
        C14360o3.A07(string);
        boolean booleanValue = C6PY.A00(c8q6.A0f).booleanValue();
        int i = R.drawable.instagram_sparkles_pano_outline_24;
        if (booleanValue) {
            i = R.drawable.instagram_effects_pano_outline_24;
        }
        arrayList.add(new C199928sw(null, context.getDrawable(i), null, new InterfaceC199918sv() { // from class: X.9MC
            @Override // X.InterfaceC199918sv
            public final void onClick() {
                C8Q6 c8q62 = C8Q6.this;
                c8q62.A0w.dismiss();
                c8q62.A0s.A02();
            }
        }, null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A04(C8Q6 c8q6) {
        InterfaceC56392iX interfaceC56392iX = c8q6.A0i;
        if (interfaceC56392iX.CWW()) {
            C8QC.A05(new View[]{interfaceC56392iX.getView()}, false);
        }
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131954800);
        C14360o3.A07(string);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_closed_captions_enabled_pano_outline_24), null, new C23936AjW(c8q6), null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A05(final C8Q6 c8q6) {
        C8QC.A05(new View[]{c8q6.A0J}, false);
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131961186);
        C14360o3.A07(string);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_draw_pano_outline_24), null, new InterfaceC199918sv() { // from class: X.8su
            @Override // X.InterfaceC199918sv
            public final void onClick() {
                C8Q6 c8q62 = C8Q6.this;
                c8q62.A0w.dismiss();
                c8q62.A0s.A08();
            }
        }, null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r4 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C8Q6 r29) {
        /*
            r3 = r29
            X.840 r0 = r3.A02
            X.83z r0 = r0.A02
            X.83h r0 = r0.A01
            X.8Ee r2 = r0.A03()
            r12 = 0
            if (r2 == 0) goto L99
            java.lang.String r0 = r2.A0l
            java.lang.String r4 = r2.A0m
            boolean r1 = r2.A0E()
            if (r0 == 0) goto L1c
            r0 = 1
            if (r4 != 0) goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r1 == 0) goto L99
            if (r0 == 0) goto L99
            com.instagram.common.session.UserSession r5 = r3.A0f
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36327172694817159(0x810f5f002b3987, double:3.036788517761186E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L99
            java.util.ArrayList r1 = r3.A0z
            android.content.Context r4 = r3.A0G
            r0 = 2131963280(0x7f132d90, float:1.9563309E38)
            java.lang.String r11 = r4.getString(r0)
            X.C14360o3.A07(r11)
            r0 = 2131238984(0x7f082048, float:1.8094262E38)
            android.graphics.drawable.Drawable r7 = r4.getDrawable(r0)
            X.Aji r9 = new X.Aji
            r9.<init>(r3, r2)
            r6 = 0
            r16 = 1
            r23 = 1
            X.8sw r5 = new X.8sw
            r8 = r6
            r10 = r6
            r13 = r12
            r14 = r12
            r15 = r12
            r17 = r12
            r18 = r16
            r19 = r12
            r20 = r12
            r21 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.add(r5)
            r0 = 2131953621(0x7f1307d5, float:1.9543718E38)
            java.lang.String r19 = r4.getString(r0)
            X.C14360o3.A07(r19)
            r0 = 2131238980(0x7f082044, float:1.8094254E38)
            android.graphics.drawable.Drawable r15 = r4.getDrawable(r0)
            X.Ajj r0 = new X.Ajj
            r0.<init>(r3, r2)
            X.8sw r13 = new X.8sw
            r14 = r6
            r16 = r6
            r17 = r0
            r18 = r6
            r22 = r12
            r24 = r12
            r25 = r12
            r26 = r23
            r27 = r12
            r28 = r12
            r29 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.add(r13)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Q6.A06(X.8Q6):void");
    }

    public static final void A07(final C8Q6 c8q6) {
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131964733);
        C14360o3.A07(string);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_third_party_gen_ai_pano_outline_24), null, new InterfaceC199918sv() { // from class: X.8sy
            @Override // X.InterfaceC199918sv
            public final void onClick() {
                C183688Ct c183688Ct = C8Q6.this.A0s.A00;
                MediaGenAIDetectionMethod mediaGenAIDetectionMethod = c183688Ct.A1E.A03.A02;
                FragmentActivity requireActivity = c183688Ct.A0t.requireActivity();
                UserSession userSession = c183688Ct.A0w;
                String moduleName = c183688Ct.A0v.getModuleName();
                AbstractC86593tX.A0P(requireActivity, EnumC124565kK.STORY, mediaGenAIDetectionMethod, userSession, c183688Ct.A0R, moduleName, null);
            }
        }, null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A08(final C8Q6 c8q6) {
        C8QC.A05(new View[]{c8q6.A0N}, false);
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131972699);
        C14360o3.A07(string);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_download_pano_outline_24), null, new InterfaceC199918sv() { // from class: X.8sx
            @Override // X.InterfaceC199918sv
            public final void onClick() {
                C8Q6 c8q62 = C8Q6.this;
                c8q62.A0w.dismiss();
                c8q62.A0s.A0A();
            }
        }, null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A09(final C8Q6 c8q6) {
        C8QC.A05(new View[]{c8q6.A0o.getView()}, false);
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131974289);
        C14360o3.A07(string);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_add_users_pano_outline_24), null, new InterfaceC199918sv() { // from class: X.8vw
            @Override // X.InterfaceC199918sv
            public final void onClick() {
                C8Q6 c8q62 = C8Q6.this;
                c8q62.A0w.dismiss();
                c8q62.A0s.A0B();
            }
        }, null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A0A(final C8Q6 c8q6) {
        UserSession userSession = c8q6.A0f;
        if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("has_story_comments_global_setting_disabled", false) && c8q6.A0B && C18U.A06(C06090Tz.A05, userSession, 36318221980145700L)) {
            ArrayList arrayList = c8q6.A0z;
            Context context = c8q6.A0G;
            String string = context.getString(2131975784);
            C14360o3.A07(string);
            arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_comments_off_pano_outline_24), null, new InterfaceC199918sv() { // from class: X.8sz
                @Override // X.InterfaceC199918sv
                public final void onClick() {
                    C8Q6 c8q62 = C8Q6.this;
                    c8q62.A0s.A00.A15.A01.A0I = true;
                    c8q62.A0B = false;
                    c8q62.A0z.removeIf(new C24945B1t(new B8U(c8q62, 41)));
                    C8Q6.A0B(c8q62);
                    C8Q6.A0I(c8q62);
                    C9GR.A07(c8q62.A0G, 2131974587);
                }
            }, null, string, 0, 0, 0, false, false, false, true, false, false, false));
        }
    }

    public static final void A0B(C8Q6 c8q6) {
        UserSession userSession = c8q6.A0f;
        if (!AbstractC23021Ah.A00(userSession).A01.getBoolean("has_story_comments_global_setting_disabled", false) && !c8q6.A0B && C18U.A06(C06090Tz.A05, userSession, 36318221980145700L)) {
            ArrayList arrayList = c8q6.A0z;
            Context context = c8q6.A0G;
            String string = context.getString(2131975807);
            C14360o3.A07(string);
            arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_comment_pano_outline_24), null, new C23939AjZ(c8q6), null, string, 0, 0, 0, false, false, false, true, false, false, false));
        }
    }

    public static final void A0C(C8Q6 c8q6) {
        InterfaceC56392iX interfaceC56392iX = c8q6.A0p;
        if (interfaceC56392iX.CWW()) {
            C8QC.A05(new View[]{interfaceC56392iX.getView()}, false);
        }
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131976936);
        C14360o3.A07(string);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_microphone_pano_outline_24), null, new C23940Aja(c8q6), null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A0D(C8Q6 c8q6) {
        InterfaceC56392iX interfaceC56392iX = c8q6.A0q;
        if (interfaceC56392iX.CWW()) {
            C8QC.A05(new View[]{interfaceC56392iX.getView()}, false);
        }
        ArrayList arrayList = c8q6.A0z;
        Context context = c8q6.A0G;
        String string = context.getString(2131976938);
        C14360o3.A07(string);
        arrayList.add(new C199928sw(null, context.getDrawable(R.drawable.instagram_sliders_pano_outline_24), null, new C23941Ajb(c8q6), null, string, 0, 0, 0, false, false, false, true, false, false, false));
    }

    public static final void A0E(C8Q6 c8q6) {
        C1809080s A00;
        if (c8q6.A02.A01 == C22P.A5H) {
            AnonymousClass856 anonymousClass856 = c8q6.A0u;
            C1809080s A002 = anonymousClass856.A00();
            if ((A002 != null && A002.A01) || (A00 = anonymousClass856.A00()) == null) {
                return;
            }
            A00.A01(c8q6.A0O(), c8q6.A0t.A03, EnumC199188rL.A0G);
        }
    }

    public static final void A0F(C8Q6 c8q6) {
        C1809080s A00;
        AnonymousClass856 anonymousClass856 = c8q6.A0u;
        C1809080s A002 = anonymousClass856.A00();
        if (A002 != null && A002.A01) {
            return;
        }
        View view = c8q6.A0K;
        if (view.getVisibility() != 0 || (A00 = anonymousClass856.A00()) == null) {
            return;
        }
        A00.A01(c8q6.A0O(), view, EnumC199188rL.A0a);
    }

    public static final void A0G(C8Q6 c8q6) {
        C1809080s A00;
        if (c8q6.A0r.A00() instanceof C81V) {
            AnonymousClass856 anonymousClass856 = c8q6.A0u;
            C1809080s A002 = anonymousClass856.A00();
            if (A002 != null && A002.A01) {
                return;
            }
            View view = c8q6.A0H;
            if (view.getVisibility() != 0 || (A00 = anonymousClass856.A00()) == null) {
                return;
            }
            A00.A01(c8q6.A0O(), view, EnumC199188rL.A0n);
        }
    }

    public static final void A0H(C8Q6 c8q6) {
        AnonymousClass229.A01(c8q6.A0f).A03.A07("clips_post_cap_audio_button");
        C183688Ct c183688Ct = c8q6.A0s.A00;
        AnonymousClass229.A01(c183688Ct.A0w).A1R(EnumC50631MWs.A0I, "AUDIO_CONTROLS_ADD_MUSIC");
        c183688Ct.A1S.A03(C8BN.POST_CAPTURE_AUDIO_BUTTON, null, null, null, false, false, false, false);
    }

    public static final void A0I(final C8Q6 c8q6) {
        if (!c8q6.A08) {
            c8q6.A0w.A02(c8q6.A0z);
            if (!c8q6.A07) {
                c8q6.A07 = true;
                ImageView imageView = c8q6.A0W;
                imageView.setImageResource(R.drawable.instagram_chevron_left_pano_outline_rtl_24);
                Context context = c8q6.A0G;
                imageView.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                View view = c8q6.A0J;
                C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView2 = (ImageView) view;
                imageView2.setImageResource(R.drawable.instagram_draw_pano_outline_24);
                imageView2.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                View view2 = c8q6.A0N;
                C14360o3.A0C(view2, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView3 = (ImageView) view2;
                imageView3.setImageResource(R.drawable.instagram_download_pano_outline_24);
                imageView3.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                imageView3.setScaleType(scaleType);
                View view3 = c8q6.A0L;
                C14360o3.A0C(view3, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView4 = (ImageView) view3;
                imageView4.setImageResource(R.drawable.instagram_fit_pano_outline_24);
                imageView4.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                imageView4.setScaleType(scaleType);
                ImageView imageView5 = c8q6.A0b;
                if (imageView5 != null) {
                    imageView5.setImageResource(R.drawable.instagram_text_pano_outline_24);
                    imageView5.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                }
                ImageView imageView6 = c8q6.A0R;
                if (imageView6 != null) {
                    imageView6.setImageResource(R.drawable.instagram_sticker_pano_outline_24);
                    imageView6.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                }
                InterfaceC56392iX interfaceC56392iX = c8q6.A0m;
                if (interfaceC56392iX.CWW()) {
                    View view4 = interfaceC56392iX.getView();
                    C14360o3.A0C(view4, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView7 = (ImageView) view4;
                    imageView7.setImageResource(R.drawable.instagram_layout_pano_outline_24);
                    imageView7.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                }
                c8q6.A0a.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
                c8q6.A0l.EZv(new InterfaceC69513Al() { // from class: X.8rQ
                    @Override // X.InterfaceC69513Al
                    public final void DLu(View view5) {
                        C14360o3.A0B(view5, 0);
                        View requireViewById = view5.requireViewById(R.id.post_capture_camera_genai_expand_button);
                        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type android.widget.ImageView");
                        ImageView imageView8 = (ImageView) requireViewById;
                        imageView8.setImageResource(R.drawable.instagram_expand_pano_outline_24);
                        C3P9 c3p9 = new C3P9(imageView8);
                        final C8Q6 c8q62 = C8Q6.this;
                        c3p9.A04 = new C3PD() { // from class: X.9hy
                            @Override // X.C3PD, X.C3PE
                            public final boolean DsE(View view6) {
                                C8Q6 c8q63 = C8Q6.this;
                                c8q63.A0s.A0F(EnumC193878i8.A0A, C05F.A0C);
                                C22C A01 = AnonymousClass229.A01(c8q63.A0f);
                                C81W c81w = C81W.A0H;
                                A01.A0F.A0S(c8q63.A0r.A00().A00, null, c81w, AbstractC166987dD.A1J(EnumC203578zI.POST_CAPTURE_UTILITY_TOOLBAR), 0, 0);
                                return true;
                            }
                        };
                        c3p9.A05 = C05F.A01;
                        c3p9.A00();
                    }
                });
            }
            Context context2 = c8q6.A0G;
            ViewGroup viewGroup = c8q6.A0P;
            C14360o3.A0B(viewGroup, 1);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setSize(context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), context2.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_secondary_button_on_media_panavision_updated)));
                    gradientDrawable.setCornerRadius(AbstractC13880nE.A04(context2, 30));
                    childAt.setBackground(gradientDrawable);
                }
            }
        }
    }

    public static final void A0J(C8Q6 c8q6) {
        AnonymousClass693 anonymousClass693 = c8q6.A0e;
        if (anonymousClass693 != null && anonymousClass693.isPlaying()) {
            anonymousClass693.stop();
        }
        c8q6.A08 = false;
        ImageView imageView = c8q6.A0b;
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.instagram_text_pano_outline_24);
        }
        A0I(c8q6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r2.A02().A09 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0K(X.C8Q6 r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Q6.A0K(X.8Q6):void");
    }

    public static final void A0L(C8Q6 c8q6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C9BS(EnumC53325Ni3.A0R));
        }
        if (z2) {
            arrayList.add(new C9BS(EnumC53325Ni3.A0I));
        }
        if (z3) {
            arrayList.add(new C9BS(EnumC53325Ni3.A06));
        }
        if (z4) {
            arrayList.add(new C9BS(EnumC53325Ni3.A05));
        }
        if (z5) {
            arrayList.add(new C9BS(EnumC53325Ni3.A08));
        }
        if (z7) {
            arrayList.add(new C9BS(EnumC53325Ni3.A0f));
        }
        if (z8) {
            arrayList.add(new C9BS(EnumC53325Ni3.A03));
        }
        if (z9) {
            arrayList.add(new C9BS(EnumC53325Ni3.A0F));
        }
        if (z10) {
            arrayList.add(new C9BS(EnumC53325Ni3.A0h));
        }
        if (z6) {
            UserSession userSession = c8q6.A0f;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (!C18U.A06(c06090Tz, userSession, 36327237116574114L) && !C18U.A06(c06090Tz, userSession, 36327237116639651L)) {
                arrayList.add(new C9BS(EnumC53325Ni3.A0W));
            }
        }
        C8QA c8qa = c8q6.A01;
        if (c8qa != null) {
            c8qa.notifyDataSetChanged();
            c8qa.A00 = arrayList;
        }
    }

    public static final boolean A0M(C8Q6 c8q6) {
        C8JU c8ju;
        C1810981l c1810981l = c8q6.A1C;
        if (c1810981l == null || !(c1810981l.A08.A00 instanceof C81V) || (((c8ju = c8q6.A0r.A00.A0E) != null && c8ju.CUs()) || c8q6.A02.A02.A0B())) {
            return false;
        }
        return true;
    }

    public static final View[] A0N(C8Q6 c8q6) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View[] viewArr = new View[29];
        ImageView imageView = c8q6.A0W;
        ImageView imageView2 = c8q6.A0V;
        InterfaceC56392iX interfaceC56392iX = c8q6.A0o;
        View view10 = null;
        if (interfaceC56392iX.CWW()) {
            view = interfaceC56392iX.getView();
        } else {
            view = null;
        }
        InterfaceC56392iX interfaceC56392iX2 = c8q6.A0n;
        if (interfaceC56392iX2.CWW()) {
            view2 = interfaceC56392iX2.getView();
        } else {
            view2 = null;
        }
        InterfaceC56392iX interfaceC56392iX3 = c8q6.A0i;
        if (interfaceC56392iX3.CWW()) {
            view3 = interfaceC56392iX3.getView();
        } else {
            view3 = null;
        }
        InterfaceC56392iX interfaceC56392iX4 = c8q6.A0p;
        if (interfaceC56392iX4.CWW()) {
            view4 = interfaceC56392iX4.getView();
        } else {
            view4 = null;
        }
        InterfaceC56392iX interfaceC56392iX5 = c8q6.A0q;
        if (interfaceC56392iX5.CWW()) {
            view5 = interfaceC56392iX5.getView();
        } else {
            view5 = null;
        }
        InterfaceC56392iX interfaceC56392iX6 = c8q6.A0k;
        if (interfaceC56392iX6.CWW()) {
            view6 = interfaceC56392iX6.getView();
        } else {
            view6 = null;
        }
        ImageView imageView3 = c8q6.A0T;
        ImageView imageView4 = c8q6.A0r.A00.A1E.A00;
        InterfaceC56392iX interfaceC56392iX7 = c8q6.A0h;
        if (interfaceC56392iX7.CWW()) {
            view7 = interfaceC56392iX7.getView();
        } else {
            view7 = null;
        }
        InterfaceC56392iX interfaceC56392iX8 = c8q6.A0m;
        if (interfaceC56392iX8.CWW()) {
            view8 = interfaceC56392iX8.getView();
        } else {
            view8 = null;
        }
        C183608Cl c183608Cl = c8q6.A0v;
        if (c183608Cl != null && c183608Cl.A03) {
            view9 = null;
        } else {
            view9 = c8q6.A0L;
        }
        InterfaceC56392iX interfaceC56392iX9 = c8q6.A0l;
        if (interfaceC56392iX9.CWW()) {
            view10 = interfaceC56392iX9.getView();
        }
        System.arraycopy(new View[]{imageView, imageView2, view, view2, view3, view4, view5, view6, imageView3, imageView4, view7, view8, view9, view10, (View) c8q6.A10.getValue(), c8q6.A0N, c8q6.A0R, c8q6.A0X, c8q6.A0U, c8q6.A0Z, (View) c8q6.A12.getValue(), (View) c8q6.A11.getValue(), (View) c8q6.A14.getValue(), c8q6.A0Y, c8q6.A0J, c8q6.A0b, c8q6.A0a}, 0, viewArr, 0, 27);
        System.arraycopy(new View[]{c8q6.A0K, c8q6.A0t.A03}, 0, viewArr, 27, 2);
        return viewArr;
    }

    public final View A0O() {
        Object value = this.A1E.getValue();
        C14360o3.A07(value);
        return (View) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r19 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q(boolean r19) {
        /*
            r18 = this;
            r5 = r18
            r4 = r19
            r5.A0E = r4
            X.9U4 r3 = r5.A03
            if (r3 == 0) goto L34
            X.05A r2 = r3.A0M
        Lc:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            X.9Zf r6 = (X.C211719Zf) r6
            r7 = 0
            boolean r0 = X.C9U4.A09(r3)
            if (r0 == 0) goto L1d
            r13 = 1
            if (r19 != 0) goto L1e
        L1d:
            r13 = 0
        L1e:
            r14 = 0
            r12 = 1019(0x3fb, float:1.428E-42)
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r15 = r14
            r16 = r14
            r17 = r14
            X.9Zf r0 = X.C211719Zf.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto Lc
        L34:
            A0K(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Q6.A0Q(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A0f, 36327250001476012L) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A0f, 36327250001410475L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A0f, 36327250001541549L) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        r4.A0L.Egh(java.lang.Boolean.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0R(boolean r7) {
        /*
            r6 = this;
            X.9U4 r4 = r6.A03
            if (r4 == 0) goto L5d
            X.8Q4 r5 = r6.A0r
            X.55U r1 = r5.A00()
            X.9Kk r0 = X.C208509Kk.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L21
            com.instagram.common.session.UserSession r3 = r6.A0f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327250001541549(0x810f71000239ad, double:3.0368374068449795E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L53
        L21:
            X.55U r0 = r5.A00()
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L38
            com.instagram.common.session.UserSession r3 = r6.A0f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327250001476012(0x810f71000139ac, double:3.0368374068035336E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L53
        L38:
            X.55U r1 = r5.A00()
            X.81T r0 = X.C81T.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5d
            com.instagram.common.session.UserSession r3 = r6.A0f
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327250001410475(0x810f71000039ab, double:3.036837406762088E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L5d
        L53:
            X.05A r1 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.Egh(r0)
        L5c:
            return
        L5d:
            if (r7 == 0) goto L5c
            android.view.View[] r2 = A0N(r6)
            android.view.View r1 = r6.A0M
            r5 = 0
            android.view.View r0 = r6.A0H
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            java.lang.Object[] r4 = X.AbstractC06960Yn.A0b(r2, r0)
            android.view.View[] r4 = (android.view.View[]) r4
            int r3 = r4.length
            r2 = 0
        L74:
            if (r2 >= r3) goto L5c
            r1 = r4[r2]
            android.widget.ImageView r0 = r6.A0Y
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L9f
            android.widget.ImageView r0 = r6.A0W
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L9f
            android.view.View r0 = r6.A0L
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L9f
            android.widget.ImageView r0 = r6.A0R
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L9f
            android.view.View[] r0 = new android.view.View[]{r1}
            X.C8QC.A05(r0, r5)
        L9f:
            int r2 = r2 + 1
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Q6.A0R(boolean):void");
    }

    public C8Q6(Activity activity, Context context, View view, ViewStub viewStub, AbstractC59962oe abstractC59962oe, C1819485e c1819485e, final UserSession userSession, C1810981l c1810981l, C8Q4 c8q4, C8DN c8dn, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, AnonymousClass856 anonymousClass856, C183608Cl c183608Cl, C1828989k c1828989k, int i, boolean z, boolean z2, boolean z3) {
        TouchInterceptorLinearLayout touchInterceptorLinearLayout;
        C14360o3.A0B(c8q4, 6);
        this.A0G = context;
        this.A0f = userSession;
        this.A0r = c8q4;
        this.A0s = c8dn;
        this.A1B = c1819485e;
        this.A02 = anonymousClass840;
        this.A0u = anonymousClass856;
        this.A1C = c1810981l;
        this.A1D = c1828989k;
        this.A19 = z;
        this.A18 = z2;
        this.A1F = z3;
        this.A0v = c183608Cl;
        this.A0y = new WeakReference(activity);
        this.A16 = C1XM.A00(new C9E4(targetViewSizeProvider, 39));
        this.A1E = C1XM.A00(new C9F5(12, view, viewStub));
        this.A10 = C1XM.A00(new C9E4(this, 33));
        this.A12 = C1XM.A00(new C9E4(this, 35));
        this.A13 = C1XM.A00(new C9E4(this, 36));
        this.A11 = C1XM.A00(new C9E4(this, 34));
        this.A14 = C1XM.A00(new C9E4(this, 37));
        this.A0B = true;
        this.A15 = C1XM.A00(new C9E4(this, 38));
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: X.8Q7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C8Q6.this.A0s.A00.A1N.E4u(new Object());
                return false;
            }
        };
        this.A1A = onTouchListener;
        this.A17 = C1XM.A00(new C9E4(this, 40));
        this.A0e = C68U.A00(context, R.raw.story_text_tool_halloween_nux);
        if (view != null) {
            A0O().setVisibility(0);
        }
        if (!z2 && !((Boolean) this.A17.getValue()).booleanValue()) {
            View requireViewById = A0O().requireViewById(R.id.post_capture_preview_size_placeholder);
            C14360o3.A07(requireViewById);
            NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
            AbstractC13880nE.A0W(requireViewById, nineSixteenLayoutConfigImpl.A0K.getHeight());
            requireViewById.setVisibility(0);
            this.A00 = (RecyclerView) A0O().requireViewById(R.id.creation_toolbar_recyclerview);
            int i2 = nineSixteenLayoutConfigImpl.A06;
            Context context2 = A0O().getContext();
            C14360o3.A07(context2);
            this.A01 = new C8QA(context2, userSession, new C8Q9(this), i2);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(A0O().getContext(), 0, false));
            }
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.A01);
            }
            AbstractC70653Fc abstractC70653Fc = new AbstractC70653Fc() { // from class: X.8QB
                @Override // X.AbstractC70653Fc
                public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView3, C3F5 c3f5) {
                    int i3;
                    C14360o3.A0B(rect, 0);
                    C14360o3.A0B(view2, 1);
                    C14360o3.A0B(recyclerView3, 2);
                    C14360o3.A0B(c3f5, 3);
                    super.getItemOffsets(rect, view2, recyclerView3, c3f5);
                    C8QA c8qa = C8Q6.this.A01;
                    if (c8qa != null) {
                        Integer num = C8QA.A06;
                        if (num != null) {
                            i3 = num.intValue();
                        } else {
                            Context context3 = c8qa.A03;
                            float A04 = AbstractC13880nE.A04(context3, 7);
                            float A042 = AbstractC13880nE.A04(context3, 44);
                            float A01 = C1H4.A01(r2 / (A04 + A042)) - 0.5f;
                            i3 = (int) ((c8qa.A02 - (A042 * A01)) / A01);
                            C8QA.A06 = Integer.valueOf(i3);
                        }
                        if (Integer.valueOf(i3) != null) {
                            rect.left = i3;
                            if (RecyclerView.A02(view2) == c3f5.A00() - 1) {
                                rect.right = i3;
                            }
                        }
                    }
                }
            };
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                recyclerView3.A10(abstractC70653Fc);
            }
        }
        C8QC.A00(A0O(), i);
        ViewGroup viewGroup = (ViewGroup) A0O().requireViewById(R.id.edit_buttons_toolbar);
        this.A0P = viewGroup;
        if ((viewGroup instanceof TouchInterceptorLinearLayout) && (touchInterceptorLinearLayout = (TouchInterceptorLinearLayout) viewGroup) != null) {
            touchInterceptorLinearLayout.COs(onTouchListener);
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0);
        viewGroup.setLayoutParams(marginLayoutParams);
        ViewGroup viewGroup2 = (ViewGroup) A0O().requireViewById(R.id.post_capture_button_share_container);
        this.A0Q = viewGroup2;
        View requireViewById2 = A0O().requireViewById(R.id.asset_button_container);
        this.A0H = requireViewById2;
        View A0O = A0O();
        if (z2) {
            this.A0R = (ImageView) A0O.findViewById(R.id.feed_creation_asset_button);
            requireViewById2.setVisibility(8);
        } else {
            this.A0R = (ImageView) A0O.requireViewById(R.id.asset_button);
        }
        this.A0c = (ProgressBar) A0O().requireViewById(R.id.post_capture_camera_add_asset_button_progress_bar);
        this.A0S = (ImageView) A0O().requireViewById(R.id.valentines_icon);
        C183688Ct c183688Ct = c8dn.A00;
        C150286pc c150286pc = c183688Ct.A1h;
        if (c150286pc != null) {
            ((C8NW) c150286pc.get()).A0v.A01.A06(abstractC59962oe, new C8QE(new C206899Du(this, 17)));
            ((C8NW) c150286pc.get()).A0v.A02.A06(abstractC59962oe, new C8QE(new C206899Du(this, 18)));
        }
        this.A0X = (ImageView) A0O().findViewById(R.id.gallery_sticker_button);
        this.A0b = (ImageView) A0O().findViewById(R.id.add_text_button);
        this.A0a = (ImageView) A0O().requireViewById(R.id.remix_camera_button);
        this.A0J = A0O().requireViewById(R.id.draw_button);
        this.A0I = A0O().requireViewById(R.id.done_button);
        this.A0O = A0O().requireViewById(R.id.undo_button);
        this.A0W = (ImageView) A0O().requireViewById(R.id.cancel_button);
        this.A0V = (ImageView) A0O().requireViewById(R.id.camera_button);
        this.A0T = (ImageView) A0O().requireViewById(R.id.video_mute_button);
        this.A0U = (ImageView) A0O().requireViewById(R.id.audio_mixing_button);
        this.A0Z = (ImageView) A0O().requireViewById(R.id.music_button);
        this.A0Y = (ImageView) A0O().requireViewById(R.id.immersive_photo_button);
        this.A0g = AbstractC56372iV.A01(A0O().requireViewById(R.id.background_clear_button_stub), false, false);
        this.A0i = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_caption_button_stub), false, false);
        this.A0p = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_voiceover_button_stub), false, false);
        this.A0q = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_volume_button_stub), false, false);
        this.A0j = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_cutout_button_stub), false, false);
        this.A0k = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_facefilter_button_stub), false, false);
        this.A0N = ((ViewStub) A0O().requireViewById(R.id.save_button_view_stub)).inflate();
        View inflate = ((ViewStub) A0O().requireViewById(R.id.post_capture_layout_resize_button_stub)).inflate();
        this.A0M = inflate;
        this.A0L = inflate.requireViewById(R.id.post_capture_camera_resize_button);
        this.A0d = (ProgressBar) inflate.requireViewById(R.id.post_capture_camera_resize_button_progress_bar);
        C8DL c8dl = c183688Ct.A1I;
        c8dl.A00.A06(abstractC59962oe, new C8QE(new C206899Du(this, 19)));
        c8dl.A01.A06(abstractC59962oe, new C8QE(new C206899Du(this, 20)));
        this.A0l = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_layout_genai_expand_button_stub), false, false);
        this.A0h = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_boomerang_edit_button_stub), false, false);
        this.A0m = AbstractC56372iV.A01(A0O().requireViewById(R.id.post_capture_layout_edit_button_stub), false, false);
        View inflate2 = ((ViewStub) A0O().requireViewById(R.id.colour_wheel_stub)).inflate();
        C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.instagram.ui.widget.colourwheel.ColourWheelView");
        ColourWheelView colourWheelView = (ColourWheelView) inflate2;
        this.A0x = colourWheelView;
        this.A0n = AbstractC56372iV.A01(A0O().requireViewById(R.id.stories_template_pin_button_stub), false, false);
        this.A0o = AbstractC56372iV.A01(A0O().requireViewById(R.id.stories_tag_button_stub), false, false);
        View requireViewById3 = colourWheelView.requireViewById(R.id.color_picker_button);
        C14360o3.A07(requireViewById3);
        C184698Hk c184698Hk = new C184698Hk(requireViewById3, AbstractC13880nE.A04(context, 26), AbstractC13880nE.A04(context, 2), AbstractC13880nE.A04(context, 1));
        this.A0t = c184698Hk;
        colourWheelView.setColourWheelStrokeWidth(c184698Hk.A00);
        this.A0K = A0O().requireViewById(R.id.overflow_button);
        this.A0w = new C8QJ(context, userSession, Integer.valueOf(R.drawable.overflow_popup_menu_background_updated_blur), true);
        this.A0z = new ArrayList();
        Iterator it = AbstractC16960so.A1Q(this.A0I, this.A0O, this.A0L, this.A0Z, (View) this.A12.getValue(), (View) this.A11.getValue(), (View) this.A14.getValue(), this.A0Y, this.A0N, this.A0J, this.A0K).iterator();
        while (it.hasNext()) {
            AbstractC56952jT.A04((View) it.next(), C05F.A01);
        }
        this.A0h.EZv(new InterfaceC69513Al() { // from class: X.8QK
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p9 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p9.A04 = new C3PD() { // from class: X.9hp
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        Medium medium;
                        C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                        final UserSession userSession2 = c183688Ct2.A0w;
                        C22C A01 = AnonymousClass229.A01(userSession2);
                        EnumC193318hB A0I = A01.A0I();
                        C448324n c448324n = A01.A0B;
                        C14360o3.A0B(A0I, 0);
                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448324n.A01, "ig_camera_navigation");
                        if (A0f.isSampled()) {
                            A0f.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "POST_CAPTURE_EDIT_BUTTON");
                            A0f.AAP("legacy_falco_event_name", "IG_CAMERA_TAP_POST_CAPTURED_EDIT_BUTTON");
                            C22M c22m = c448324n.A04;
                            String str = c22m.A0L;
                            if (str == null) {
                                str = "";
                            }
                            AbstractC166987dD.A1S(A0f, str);
                            A0f.A8R(A0I, "capture_type");
                            AbstractC167017dG.A1A(c22m.A09, A0f);
                            AbstractC167017dG.A1B(A0f);
                            A0f.A8R(EnumC50631MWs.A0I, "surface");
                            AbstractC167007dF.A10(A0f, c448324n);
                            AbstractC167017dG.A1C(A0f);
                        }
                        C183978Ee A03 = c183688Ct2.A15.A01.A03();
                        if (A03 != null && (medium = A03.A0F) != null && Boolean.TRUE.equals(medium.A0I)) {
                            ((java.util.Set) c183688Ct2.A0x.A09.A00).add(C81W.A0B);
                            W37 w37 = (W37) c183688Ct2.A1a.get();
                            String str2 = medium.A0X;
                            Resources resources = AbstractC166987dD.A0P(c183688Ct2).getResources();
                            InterfaceC16620sF interfaceC16620sF = c183688Ct2.A21;
                            C14360o3.A0B(str2, 0);
                            AbstractC167027dH.A13(resources, userSession2, interfaceC16620sF);
                            w37.A06.invoke();
                            final File A11 = AbstractC166987dD.A11(str2);
                            final File A032 = AbstractC916948n.A03();
                            final C30487DbW c30487DbW = new C30487DbW(10, interfaceC16620sF, w37, resources);
                            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9jI
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(433475162, 3, false, false);
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:67:0x0072, code lost:
                                
                                    if (r12 == null) goto L29;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:68:0x0074, code lost:
                                
                                    r2 = X.AbstractC166997dE.A0j(r12);
                                 */
                                /* JADX WARN: Type inference failed for: r5v0, types: [X.0oO, java.lang.Object] */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void run() {
                                    /*
                                        r13 = this;
                                        java.io.File r2 = r5
                                        java.io.File r9 = r6
                                        com.instagram.common.session.UserSession r7 = r4
                                        X.0sF r4 = r7
                                        X.0oO r5 = new X.0oO
                                        r5.<init>()
                                        r3 = 0
                                        boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> Lb8
                                        if (r0 != 0) goto L17
                                        r2.mkdirs()     // Catch: java.lang.Throwable -> Lb8
                                    L17:
                                        java.lang.String r1 = "tmp_video_"
                                        java.lang.String r0 = ".mp4"
                                        java.io.File r6 = java.io.File.createTempFile(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb8
                                        r2 = 0
                                        org.xmlpull.v1.XmlPullParser r8 = X.C9Ai.A00(r7, r9)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        if (r8 != 0) goto L27
                                        goto L78
                                    L27:
                                        int r1 = r8.next()     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        r0 = 1
                                        if (r1 == r0) goto L78
                                        int r1 = r8.getEventType()     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        r0 = 2
                                        if (r1 != r0) goto L27
                                        java.lang.String r1 = "Item"
                                        java.lang.String r0 = r8.getName()     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        if (r0 == 0) goto L27
                                        r11 = 0
                                        int r10 = r8.getAttributeCount()     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        r7 = r3
                                        r12 = r3
                                    L48:
                                        if (r11 >= r10) goto L6a
                                        java.lang.String r1 = r8.getAttributeName(r11)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        java.lang.String r0 = "Semantic"
                                        boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        if (r0 == 0) goto L5b
                                        java.lang.String r7 = r8.getAttributeValue(r11)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        goto L67
                                    L5b:
                                        java.lang.String r0 = "Length"
                                        boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        if (r0 == 0) goto L67
                                        java.lang.String r12 = r8.getAttributeValue(r11)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                    L67:
                                        int r11 = r11 + 1
                                        goto L48
                                    L6a:
                                        java.lang.String r0 = "MotionPhoto"
                                        boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                        if (r0 == 0) goto L27
                                        if (r12 == 0) goto L78
                                        java.lang.Long r2 = X.AbstractC166997dE.A0j(r12)     // Catch: java.lang.Throwable -> L78 java.lang.Throwable -> Lbd
                                    L78:
                                        java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbd
                                        r8.<init>(r9)     // Catch: java.lang.Throwable -> Lbd java.lang.Throwable -> Lbd
                                        java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9c
                                        r7.<init>(r6)     // Catch: java.lang.Throwable -> L9c
                                        if (r2 == 0) goto L9d
                                        long r0 = r9.length()     // Catch: java.lang.Throwable -> L9d
                                        long r9 = r2.longValue()     // Catch: java.lang.Throwable -> L9d
                                        long r0 = r0 - r9
                                        r8.skip(r0)     // Catch: java.lang.Throwable -> L9d
                                        long r1 = android.os.FileUtils.copy(r8, r7)     // Catch: java.lang.Throwable -> L9d
                                        int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                                        if (r0 != 0) goto L9d
                                        r0 = 1
                                        r5.A00 = r0     // Catch: java.lang.Throwable -> L9d
                                        goto L9d
                                    L9c:
                                        r7 = r3
                                    L9d:
                                        r1 = 40
                                        X.J7Q r0 = new X.J7Q
                                        r0.<init>(r5, r1)
                                        r8.close()     // Catch: java.io.IOException -> La8
                                        goto Lab
                                    La8:
                                        r0.invoke()
                                    Lab:
                                        if (r7 == 0) goto Lbd
                                        r1 = 41
                                        X.J7Q r0 = new X.J7Q
                                        r0.<init>(r5, r1)
                                        r7.close()     // Catch: java.io.IOException -> Lba
                                        goto Lbd
                                    Lb8:
                                        r6 = r3
                                        goto Lbd
                                    Lba:
                                        r0.invoke()
                                    Lbd:
                                        boolean r0 = r5.A00
                                        if (r0 != 0) goto Ld4
                                        if (r6 == 0) goto Ld4
                                        java.lang.String r0 = r6.getPath()
                                        X.AbstractC13530mf.A09(r0)
                                    Lca:
                                        boolean r0 = r5.A00
                                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                        r4.invoke(r0, r3)
                                        return
                                    Ld4:
                                        r3 = r6
                                        goto Lca
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C217239jI.run():void");
                                }
                            });
                            return true;
                        }
                        c183688Ct2.A1N.E4u(new Object());
                        return true;
                    }
                };
                c3p9.A05 = C05F.A01;
                c3p9.A00();
            }
        });
        this.A0m.EZv(new InterfaceC69513Al() { // from class: X.8QL
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p9 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p9.A04 = new C3PD() { // from class: X.9hv
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C8Q6.this.A0s.A00.A1N.E4u(new Object());
                        return true;
                    }
                };
                c3p9.A05 = C05F.A01;
                c3p9.A00();
            }
        });
        this.A0n.EZv(new InterfaceC69513Al() { // from class: X.8QM
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p9 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p9.A04 = new C3PD() { // from class: X.9hx
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                        C22C A01 = AnonymousClass229.A01(c183688Ct2.A0w);
                        EnumC50631MWs enumC50631MWs = ((C22F) A01).A04.A0C;
                        if (A01.A0J() != null && enumC50631MWs != null) {
                            A01.A1R(enumC50631MWs, "STORY_TEMPLATES_PIN_TOOL");
                        }
                        c183688Ct2.A1N.E4u(new Object());
                        return true;
                    }
                };
                c3p9.A05 = C05F.A01;
                c3p9.A00();
            }
        });
        this.A0o.EZv(new InterfaceC69513Al() { // from class: X.8QN
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p9 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p9.A04 = new C3PD() { // from class: X.8vv
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C8Q6.this.A0s.A0B();
                        return true;
                    }
                };
                c3p9.A05 = C05F.A01;
                c3p9.A00();
            }
        });
        C184708Hl Csh = this.A0t.Csh();
        Csh.A00 = new InterfaceC184728Hn() { // from class: X.8QO
            @Override // X.InterfaceC184728Hn
            public final boolean D3S() {
                C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                if (!c183688Ct2.A15.A01.A0J) {
                    C183688Ct.A0G(c183688Ct2, true);
                    return true;
                }
                C22C A01 = AnonymousClass229.A01(c183688Ct2.A0w);
                EnumC50631MWs enumC50631MWs = ((C22F) A01).A04.A0C;
                if (A01.A0J() != null && enumC50631MWs != null) {
                    A01.A1R(enumC50631MWs, "STORY_BACKGROUND_COLOR");
                }
                C23769Afg c23769Afg = (C23769Afg) c183688Ct2.A1c.get();
                c23769Afg.A03.A06(c23769Afg);
                c23769Afg.A04.DWb(c23769Afg);
                EyedropperColorPickerTool eyedropperColorPickerTool = c23769Afg.A07;
                if (eyedropperColorPickerTool != null) {
                    if (c23769Afg.A01) {
                        eyedropperColorPickerTool.setColor(-1);
                    } else {
                        eyedropperColorPickerTool.setColor(c23769Afg.A00.A01()[0]);
                    }
                }
                C23769Afg.A03(c23769Afg, true);
                return true;
            }
        };
        Csh.A01 = new C8QQ() { // from class: X.8QP
            @Override // X.C8QQ
            public final void DQR() {
                C8Q6 c8q6 = C8Q6.this;
                C184698Hk c184698Hk2 = c8q6.A0t;
                Drawable.ConstantState constantState = c184698Hk2.A01().getConstantState();
                if (constantState != null && constantState.newDrawable() != null) {
                    c8q6.A0s.A00.A0e = true;
                    ColourWheelView colourWheelView2 = c8q6.A0x;
                    colourWheelView2.setBaseDrawable(c184698Hk2.A01());
                    colourWheelView2.A04();
                }
            }
        };
        Csh.A00();
        this.A0x.A0N.add(new C8LE() { // from class: X.8QR
            @Override // X.C8LE
            public final /* synthetic */ void D63() {
            }

            @Override // X.C8LE
            public final /* synthetic */ void D64() {
            }

            @Override // X.C8LE
            public final void D60(int i3) {
                C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                if (c183688Ct2.A15.A01.A0J) {
                    ((C23769Afg) c183688Ct2.A1c.get()).A05(new int[]{i3}, false, false);
                    return;
                }
                C8DV c8dv = c183688Ct2.A1V.A00;
                if (c8dv != null) {
                    c8dv.A02(i3);
                }
                C183688Ct.A0G(c183688Ct2, false);
            }

            @Override // X.C8LE
            public final void D61(int i3) {
                C8Q6 c8q6 = C8Q6.this;
                C183688Ct c183688Ct2 = c8q6.A0s.A00;
                if (c183688Ct2.A15.A01.A0J) {
                    ((C23769Afg) c183688Ct2.A1c.get()).A05(new int[]{i3}, false, true);
                } else {
                    C183688Ct.A09(c183688Ct2, i3);
                    InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
                    ARD.E77("has_used_create_mode_colour_wheel", true);
                    ARD.apply();
                }
                c8q6.A0x.setBaseDrawable(c8q6.A0t.A01());
            }

            @Override // X.C8LE
            public final void D62() {
                C8Q6.this.A0s.A00.A0e = false;
            }
        });
        ImageView imageView = this.A0R;
        if (imageView != null) {
            C3P9 c3p9 = new C3P9(imageView);
            c3p9.A04 = new C3PD() { // from class: X.8QS
                @Override // X.C3PD, X.C3PE
                public final boolean DsE(View view2) {
                    C14360o3.A0B(view2, 0);
                    C8Q6.A02(view2, C8Q6.this);
                    return true;
                }
            };
            c3p9.A00();
        }
        ImageView imageView2 = this.A0b;
        if (imageView2 != null) {
            C3P9 c3p92 = new C3P9(imageView2);
            c3p92.A04 = new C3PD() { // from class: X.8QT
                @Override // X.C3PD, X.C3PE
                public final boolean DsE(View view2) {
                    C14360o3.A0B(view2, 0);
                    C8Q6 c8q6 = C8Q6.this;
                    c8q6.A0s.A0C();
                    if (c8q6.A18) {
                        view2.performClick();
                        return true;
                    }
                    return true;
                }
            };
            c3p92.A00();
        }
        ImageView imageView3 = this.A0X;
        if (imageView3 != null) {
            C3P9 c3p93 = new C3P9(imageView3);
            c3p93.A04 = new C3PD() { // from class: X.9hq
                @Override // X.C3PD, X.C3PE
                public final boolean DsE(View view2) {
                    C14360o3.A0B(view2, 0);
                    C8Q6 c8q6 = C8Q6.this;
                    c8q6.A0s.A09();
                    if (c8q6.A18) {
                        view2.performClick();
                        return true;
                    }
                    return true;
                }
            };
            c3p93.A00();
        }
        C3P9 c3p94 = new C3P9(this.A0T);
        c3p94.A04 = new C3PD() { // from class: X.8QU
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6.this.A0s.A04();
                return true;
            }
        };
        c3p94.A00();
        C3P9 c3p95 = new C3P9(this.A0J);
        c3p95.A04 = new C3PD() { // from class: X.8QV
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6.this.A0s.A08();
                return true;
            }
        };
        c3p95.A00();
        this.A0i.EZv(new InterfaceC69513Al() { // from class: X.8QW
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p96 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p96.A04 = new C3PD() { // from class: X.9hr
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C8Q6.this.A0s.A06();
                        return true;
                    }
                };
                c3p96.A00();
            }
        });
        this.A0p.EZv(new InterfaceC69513Al() { // from class: X.8QX
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p96 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p96.A04 = new C3PD() { // from class: X.9hs
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C8Q6.this.A0s.A00.A1N.E4u(new Object());
                        return true;
                    }
                };
                c3p96.A00();
            }
        });
        this.A0q.EZv(new InterfaceC69513Al() { // from class: X.8QY
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p96 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p96.A04 = new C3PD() { // from class: X.9ht
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C8Q6.this.A0s.A00.A1N.E4u(new Object());
                        return true;
                    }
                };
                c3p96.A00();
            }
        });
        this.A0j.EZv(new InterfaceC69513Al() { // from class: X.8QZ
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p96 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p96.A04 = new C3PD() { // from class: X.9hu
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C8Q6 c8q62 = C8Q6.this;
                        c8q62.A0s.A00.A1N.E4u(new Object());
                        AnonymousClass229.A01(c8q62.A0f).A1D(EnumC203578zI.POST_CAPTURE_UTILITY_TOOLBAR);
                        return true;
                    }
                };
                c3p96.A00();
            }
        });
        this.A0k.EZv(new InterfaceC69513Al() { // from class: X.8Qa
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                ImageView imageView4 = (ImageView) view2.findViewById(R.id.camera_ar_effect_image);
                final C8Q6 c8q6 = C8Q6.this;
                imageView4.setImageResource(AbstractC172037lY.A00(c8q6.A0f));
                view2.setContentDescription(c8q6.A0G.getString(2131962024));
                C3P9 c3p96 = new C3P9(view2);
                c3p96.A04 = new C3PD() { // from class: X.8yb
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C8Q6.this.A0s.A02();
                        return true;
                    }
                };
                c3p96.A05 = C05F.A01;
                c3p96.A00();
            }
        });
        C3P9 c3p96 = new C3P9(this.A0W);
        c3p96.A04 = new C3PD() { // from class: X.8Qb
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6.this.A0s.A05();
                return true;
            }
        };
        c3p96.A00();
        C3P9 c3p97 = new C3P9(this.A0V);
        c3p97.A04 = new C3PD() { // from class: X.8Qc
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8DN c8dn2 = C8Q6.this.A0s;
                C183688Ct.A0E(c8dn2.A00, new RunnableC24327AqW(c8dn2), false);
                return true;
            }
        };
        c3p97.A00();
        C3P9 c3p98 = new C3P9(this.A0I);
        c3p98.A04 = new C3PD() { // from class: X.8Qd
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0159, code lost:
            
                if (r0.A04 == false) goto L51;
             */
            @Override // X.C3PD, X.C3PE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean DsE(android.view.View r20) {
                /*
                    Method dump skipped, instructions count: 409
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8Qd.DsE(android.view.View):boolean");
            }
        };
        Integer num = C05F.A01;
        c3p98.A05 = num;
        c3p98.A00();
        C3P9 c3p99 = new C3P9(this.A0O);
        c3p99.A04 = new C3PE() { // from class: X.8Qe
            @Override // X.C3PE
            public final void DQY(View view2) {
                C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                C8BD c8bd = c183688Ct2.A0D;
                C150286pc c150286pc2 = c183688Ct2.A1d;
                if (c8bd == c150286pc2.get()) {
                    C8PR c8pr = (C8PR) c150286pc2.get();
                    if (C8PR.A08(c8pr)) {
                        GLDrawingView gLDrawingView = C8PR.A00(c8pr).A00;
                        RunnableC24707Awo runnableC24707Awo = new RunnableC24707Awo(gLDrawingView, null);
                        X1v x1v = gLDrawingView.A05;
                        if (x1v != null) {
                            x1v.A07(runnableC24707Awo);
                        }
                        c8pr.A0E(C05F.A0C);
                        return;
                    }
                    return;
                }
                C8BD c8bd2 = c183688Ct2.A0D;
                C150286pc c150286pc3 = c183688Ct2.A1c;
                if (c8bd2 != c150286pc3.get()) {
                    return;
                }
                C23769Afg c23769Afg = (C23769Afg) c150286pc3.get();
                c23769Afg.A03.A04();
                C01U c01u = c23769Afg.A08;
                C09530e4 c09530e4 = (C09530e4) c01u.A0P();
                if (c09530e4 == null) {
                    return;
                }
                c01u.clear();
                C23769Afg.A00(c23769Afg);
                if (((Boolean) c09530e4.A01).booleanValue()) {
                    C23769Afg.A02(c23769Afg, false);
                } else {
                    C23769Afg.A01(c23769Afg, (TextColorScheme) c09530e4.A00, false, true);
                }
            }

            @Override // X.C3PE
            public final boolean DsE(View view2) {
                C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                C8BD c8bd = c183688Ct2.A0D;
                C150286pc c150286pc2 = c183688Ct2.A1d;
                if (c8bd == c150286pc2.get()) {
                    ((C8PR) c150286pc2.get()).A0B();
                    return true;
                }
                C8BD c8bd2 = c183688Ct2.A0D;
                C150286pc c150286pc3 = c183688Ct2.A1c;
                if (c8bd2 != c150286pc3.get()) {
                    return true;
                }
                C23769Afg c23769Afg = (C23769Afg) c150286pc3.get();
                c23769Afg.A03.A04();
                C09530e4 c09530e4 = (C09530e4) c23769Afg.A08.A0T();
                if (c09530e4 == null) {
                    return true;
                }
                C23769Afg.A00(c23769Afg);
                if (((Boolean) c09530e4.A01).booleanValue()) {
                    C23769Afg.A02(c23769Afg, false);
                    return true;
                }
                C23769Afg.A01(c23769Afg, (TextColorScheme) c09530e4.A00, false, true);
                return true;
            }
        };
        c3p99.A05 = num;
        c3p99.A00();
        this.A0g.EZv(new InterfaceC69513Al() { // from class: X.8Qf
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C14360o3.A0B(view2, 0);
                C3P9 c3p910 = new C3P9(view2);
                final C8Q6 c8q6 = C8Q6.this;
                c3p910.A04 = new C3PD() { // from class: X.9hw
                    @Override // X.C3PD, X.C3PE
                    public final boolean DsE(View view3) {
                        C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                        C8BD c8bd = c183688Ct2.A0D;
                        C150286pc c150286pc2 = c183688Ct2.A1c;
                        if (c8bd == c150286pc2.get()) {
                            C23769Afg.A02((C23769Afg) c150286pc2.get(), true);
                            return true;
                        }
                        return true;
                    }
                };
                c3p910.A05 = C05F.A01;
                c3p910.A00();
            }
        });
        C3P9 c3p910 = new C3P9(this.A0L);
        c3p910.A04 = new C3PD() { // from class: X.8Qg
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8DM c8dm;
                C183688Ct c183688Ct2 = C8Q6.this.A0s.A00;
                C05A c05a = c183688Ct2.A1I.A02;
                switch (((C8DM) c05a.getValue()).ordinal()) {
                    case 0:
                        c8dm = C8DM.A03;
                        break;
                    case 1:
                        c8dm = C8DM.A06;
                        break;
                    case 2:
                        c8dm = C8DM.A08;
                        break;
                    case 3:
                        c8dm = C8DM.A02;
                        break;
                    case 4:
                        c8dm = C8DM.A04;
                        break;
                    case 5:
                    case 6:
                        c8dm = C8DM.A05;
                        break;
                    case 7:
                    case 9:
                        c8dm = C8DM.A09;
                        break;
                    case 8:
                        c8dm = C8DM.A0A;
                        break;
                    case 10:
                        c8dm = C8DM.A0E;
                        break;
                    case 11:
                        c8dm = C8DM.A0C;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        c8dm = C8DM.A0D;
                        break;
                    default:
                        throw new RuntimeException();
                }
                c05a.Egh(c8dm);
                Object value = c05a.getValue();
                boolean z4 = false;
                if (value == C8DM.A09) {
                    z4 = true;
                }
                C1810981l c1810981l2 = c183688Ct2.A0x;
                java.util.Set set = (java.util.Set) c1810981l2.A09.A00;
                C81W c81w = C81W.A0r;
                if (z4) {
                    set.add(c81w);
                    C22C A01 = AnonymousClass229.A01(c183688Ct2.A0w);
                    A01.A0F.A0S(((C55U) c1810981l2.A08.A00).A00, null, c81w, null, 0, 0);
                } else {
                    set.remove(c81w);
                }
                C8Y6 c8y6 = (C8Y6) c183688Ct2.A1x.get();
                if (c8y6 != null) {
                    AnonymousClass229.A01(c8y6.A06).A2A(true, c8y6.A0M.A0t());
                    return true;
                }
                return true;
            }
        };
        c3p910.A00();
        C3P9 c3p911 = new C3P9(this.A0N);
        c3p911.A04 = new C3PD() { // from class: X.8Qh
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6.this.A0s.A0A();
                return true;
            }
        };
        c3p911.A00();
        C3P9 c3p912 = new C3P9(this.A0U);
        c3p912.A04 = new C3PD() { // from class: X.8Qi
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C14360o3.A0B(view2, 0);
                C8Q6.A0H(C8Q6.this);
                return true;
            }
        };
        c3p912.A00();
        C3P9 c3p913 = new C3P9(this.A0Z);
        c3p913.A04 = new C3PD() { // from class: X.8Qj
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8DN c8dn2 = C8Q6.this.A0s;
                Integer num2 = C05F.A06;
                C183688Ct c183688Ct2 = c8dn2.A00;
                AnonymousClass229.A01(c183688Ct2.A0w);
                ((C8NW) c183688Ct2.A1h.get()).A1N(num2, true);
                return true;
            }
        };
        c3p913.A00();
        C3P9 c3p914 = new C3P9((View) this.A12.getValue());
        c3p914.A04 = new C3PD() { // from class: X.8Qk
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                EnumC193878i8 enumC193878i8;
                EnumC172737mj enumC172737mj;
                List A0A;
                C8Q6 c8q6 = C8Q6.this;
                InterfaceC09390do interfaceC09390do = c8q6.A15;
                AnonymousClass229.A01(((AB4) interfaceC09390do.getValue()).A00).A0F.A0S(null, null, C81W.A0e, null, 0, 0);
                C183978Ee A03 = c8q6.A02.A02.A01.A03();
                if (A03 != null && (A0A = A03.A0A()) != null) {
                    enumC193878i8 = (EnumC193878i8) AbstractC001800i.A0J(A0A);
                } else {
                    enumC193878i8 = null;
                }
                if (enumC193878i8 != null) {
                    c8q6.A0s.A0F(enumC193878i8, C05F.A0C);
                } else {
                    C183688Ct c183688Ct2 = c8q6.A0s.A00;
                    C183978Ee A032 = c183688Ct2.A15.A01.A03();
                    if (A032 != null) {
                        C8CS c8cs = c183688Ct2.A1o;
                        C8CS.A01(c8cs, A032);
                        UserSession userSession2 = c8cs.A09;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession2, 36319888428637940L)) {
                            C8CS.A02(c8cs, null);
                        } else if (C18U.A06(c06090Tz, userSession2, 36319888428310257L)) {
                            C8CS.A00(c8cs);
                        }
                    }
                    InterfaceC09390do interfaceC09390do2 = c8q6.A13;
                    if (((PopupWindow) interfaceC09390do2.getValue()).getContentView() != null) {
                        int width = c8q6.A0O().getWidth() / 2;
                        InterfaceC09390do interfaceC09390do3 = c8q6.A12;
                        int i3 = 0;
                        if (((View) interfaceC09390do3.getValue()).getLeft() + (((View) interfaceC09390do3.getValue()).getWidth() / 2) >= width) {
                            ((PopupWindow) interfaceC09390do2.getValue()).getContentView().measure(0, 0);
                            i3 = (-((PopupWindow) interfaceC09390do2.getValue()).getContentView().getMeasuredWidth()) + ((View) interfaceC09390do3.getValue()).getWidth();
                        }
                        ((PopupWindow) interfaceC09390do2.getValue()).showAsDropDown((View) interfaceC09390do3.getValue(), i3, c8q6.A0G.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                        AB4 ab4 = (AB4) interfaceC09390do.getValue();
                        List<EnumC193878i8> A01 = C8Q6.A01(c8q6);
                        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A01, 10));
                        for (EnumC193878i8 enumC193878i82 : A01) {
                            C14360o3.A0B(enumC193878i82, 0);
                            int ordinal = enumC193878i82.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        enumC172737mj = EnumC172737mj.AI_MAGICMOD_EXPANDER;
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    enumC172737mj = EnumC172737mj.MAGICMOD_RESTYLE;
                                }
                            } else {
                                enumC172737mj = EnumC172737mj.MAGICMOD_BACKDROP;
                            }
                            arrayList.add(enumC172737mj);
                        }
                        AnonymousClass229.A01(ab4.A00).A24(arrayList);
                        return true;
                    }
                }
                return true;
            }
        };
        c3p914.A00();
        C3P9 c3p915 = new C3P9((View) this.A11.getValue());
        c3p915.A04 = new C3PD() { // from class: X.8Ql
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6 c8q6 = C8Q6.this;
                AB4 ab4 = (AB4) c8q6.A15.getValue();
                EnumC193878i8 enumC193878i8 = EnumC193878i8.A09;
                ab4.A00(enumC193878i8);
                c8q6.A0s.A0F(enumC193878i8, C05F.A0C);
                return true;
            }
        };
        c3p915.A00();
        C3P9 c3p916 = new C3P9((View) this.A10.getValue());
        c3p916.A04 = new C3PD() { // from class: X.8Qm
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                UserSession userSession2;
                AbstractC59962oe abstractC59962oe2;
                InterfaceC16820sZ b68;
                C8Q6 c8q6 = C8Q6.this;
                C448724r c448724r = AnonymousClass229.A01(c8q6.A0f).A0F;
                C18920wW c18920wW = c448724r.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
                if (A00.isSampled()) {
                    A00.A8R(C81X.A0C, "tool_type");
                    C22M c22m = c448724r.A04;
                    String str = c22m.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("camera_session_id", str);
                    A00.A8R(EnumC114925Hg.STORY, "camera_destination");
                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A00.A8p("event_type", 2);
                    A00.AAP("module", C22F.A08.getModuleName());
                    A00.AAP("composition_str_id", c22m.A0M);
                    A00.A8R(c22m.A0A, "composition_media_type");
                    A00.A8R(c22m.A0C, "surface");
                    A00.Cht();
                }
                C183688Ct c183688Ct2 = c8q6.A0s.A00;
                C81J c81j = c183688Ct2.A19;
                C38321qM c38321qM = c81j.A1C;
                C183978Ee A03 = c183688Ct2.A15.A01.A03();
                MusicOverlayStickerModel A0T = c183688Ct2.A0T();
                if (A03 != null) {
                    InteractiveDrawableContainer interactiveDrawableContainer = c183688Ct2.A1t;
                    Bitmap createBitmap = Bitmap.createBitmap(interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight(), Bitmap.Config.ARGB_8888);
                    c183688Ct2.EGp(new Canvas(createBitmap), 0, false, false);
                    if (A03.A15 && A0T != null) {
                        userSession2 = c183688Ct2.A0w;
                        abstractC59962oe2 = c183688Ct2.A0t;
                        boolean CV5 = c183688Ct2.A10.CV5();
                        C14360o3.A0B(userSession2, 0);
                        C14360o3.A0B(abstractC59962oe2, 1);
                        C14360o3.A0B(createBitmap, 5);
                        b68 = new C25415BMg(1, A0T, abstractC59962oe2, A03, createBitmap, userSession2, CV5);
                    } else if (c38321qM != null) {
                        userSession2 = c183688Ct2.A0w;
                        abstractC59962oe2 = c183688Ct2.A0t;
                        int i3 = c81j.A00;
                        boolean CV52 = c183688Ct2.A10.CV5();
                        C14360o3.A0B(userSession2, 0);
                        C14360o3.A0B(abstractC59962oe2, 1);
                        C14360o3.A0B(createBitmap, 6);
                        b68 = new B68(createBitmap, abstractC59962oe2, userSession2, c38321qM, A03, i3, CV52);
                    }
                    CYE.A01(abstractC59962oe2, userSession2, b68);
                    return true;
                }
                AbstractC12120kG.A0I("Can't launch AI Background", null, AbstractC06930Yk.A0E());
                return true;
            }
        };
        c3p916.A05 = num;
        c3p916.A00();
        C3P9 c3p917 = new C3P9((View) this.A14.getValue());
        c3p917.A04 = new C3PD() { // from class: X.8Qn
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6 c8q6 = C8Q6.this;
                AB4 ab4 = (AB4) c8q6.A15.getValue();
                EnumC193878i8 enumC193878i8 = EnumC193878i8.A0B;
                ab4.A00(enumC193878i8);
                c8q6.A0s.A0F(enumC193878i8, C05F.A0C);
                return true;
            }
        };
        c3p917.A00();
        C3P9 c3p918 = new C3P9(this.A0Y);
        c3p918.A04 = new C3PD() { // from class: X.8Qo
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6.this.A0s.A00.A1D.A05.E4u(new Object());
                return true;
            }
        };
        c3p918.A00();
        C3P9 c3p919 = new C3P9(this.A0K);
        c3p919.A04 = new C3PD() { // from class: X.8Qp
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6 c8q6 = C8Q6.this;
                C22C A01 = AnonymousClass229.A01(c8q6.A0f);
                EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0I;
                if (A01.A0Q("logPostCapOverflowMenuTap()")) {
                    A01.A1R(enumC50631MWs, "HEADER_OVERFLOW_BUTTON");
                }
                Context context3 = c8q6.A0G;
                int dimensionPixelSize = context3.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
                int dimensionPixelSize2 = context3.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                C8QJ c8qj = c8q6.A0w;
                if (c8qj.getContentView() != null) {
                    c8qj.getContentView().measure(0, 0);
                    c8qj.showAsDropDown(c8q6.A0K, (-c8qj.getContentView().getMeasuredWidth()) + dimensionPixelSize, dimensionPixelSize2);
                    return true;
                }
                return true;
            }
        };
        c3p919.A00();
        C3P9 c3p920 = new C3P9(this.A0a);
        c3p920.A04 = new C3PD() { // from class: X.8Qq
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view2) {
                C8Q6 c8q6 = C8Q6.this;
                C006802i.A0p.markerStart(181540910);
                C8Y6 c8y6 = (C8Y6) c8q6.A0s.A00.A1x.get();
                if (c8y6 != null) {
                    C8JU c8ju = c8y6.A0L;
                    c8ju.Del();
                    C191018cx c191018cx = C191018cx.A00;
                    C150286pc c150286pc2 = c8y6.A0P;
                    c150286pc2.getClass();
                    C191478dz c191478dz = (C191478dz) c150286pc2.get();
                    c191478dz.A0s.A0I.A0B(c8y6.A08.A04());
                    ((C1809981b) c8y6.A0J).A01.A04(new C8U0(c191018cx));
                    c8ju.FBz();
                    return true;
                }
                return true;
            }
        };
        c3p920.A00();
        C8QA c8qa = this.A01;
        if (c8qa != null) {
            c8qa.A01 = true;
        }
        C1812982h.A03(viewGroup2, targetViewSizeProvider);
        if (abstractC59962oe.getActivity() != null) {
            this.A0C = (C89P) new C52942bb(new C89O(abstractC59962oe.requireActivity(), userSession), abstractC59962oe.requireActivity()).A00(C89P.class);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36327250001410475L) || C18U.A06(c06090Tz, userSession, 36327250001476012L) || C18U.A06(c06090Tz, userSession, 36327250001541549L)) {
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                final AnonymousClass840 anonymousClass8402 = this.A02;
                this.A03 = (C9U4) new C52942bb(new AbstractC61132qb(userSession, anonymousClass8402) { // from class: X.9gl
                    public final UserSession A00;
                    public final AnonymousClass840 A01;

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        UserSession userSession2 = this.A00;
                        AnonymousClass840 anonymousClass8403 = this.A01;
                        C14360o3.A0B(userSession2, 0);
                        return new C9U4(userSession2, anonymousClass8403, (C183608Cl) userSession2.A01(C183608Cl.class, C183598Ck.A00));
                    }

                    {
                        this.A00 = userSession;
                        this.A01 = anonymousClass8402;
                    }
                }, requireActivity).A00(C9U4.class);
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
                C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9DH(this, viewLifecycleOwner, c07s, null, 25), A00);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02f6, code lost:
    
        if (r84 != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0306, code lost:
    
        if (r84 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x031b, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x031d, code lost:
    
        r6 = r3.A0M;
        r10 = r3.A0R;
        r35 = X.EnumC1810181d.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0327, code lost:
    
        if (r75 != r35) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0329, code lost:
    
        if (r78 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x032b, code lost:
    
        if (r79 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x032d, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x032e, code lost:
    
        if (r83 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0331, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0332, code lost:
    
        if (r90 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0334, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0335, code lost:
    
        if (r10 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0337, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x033a, code lost:
    
        if (r75 == X.EnumC1810181d.A0L) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x033d, code lost:
    
        if (r9 != false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x033f, code lost:
    
        if (r8 != false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0341, code lost:
    
        if (r7 != false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0343, code lost:
    
        r29 = X.C05F.A0C;
        r65 = r29;
        r19 = false;
        r41 = false;
        r42 = false;
        r5 = false;
        r7 = false;
        r25 = false;
        r39 = false;
        r18 = false;
        r37 = false;
        r22 = false;
        r28 = false;
        r14 = false;
        r43 = false;
        r24 = false;
        r16 = false;
        r38 = false;
        r6 = false;
        r20 = false;
        r32 = false;
        r33 = false;
        r27 = false;
        r23 = false;
        r26 = false;
        r31 = false;
        r30 = false;
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0376, code lost:
    
        if (r2 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0378, code lost:
    
        A0L(r73, r14, r18, r39, r25, r7, r5, r6, r6, r6, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0391, code lost:
    
        if (r43 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0397, code lost:
    
        if (r73.A04 == X.C8DM.A0D) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0399, code lost:
    
        r4 = r73.A0v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x039b, code lost:
    
        if (r4 == null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x039f, code lost:
    
        if (r4.A03 != r1) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x098f, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03a2, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0M}, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03ac, code lost:
    
        if (r43 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03ae, code lost:
    
        r73.A0s.A0E(r73.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03b5, code lost:
    
        if (r42 != false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03b7, code lost:
    
        r10 = r73.A0l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03bd, code lost:
    
        if (r10.CWW() == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03bf, code lost:
    
        X.C8QC.A05(new android.view.View[]{r10.getView()}, r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03cc, code lost:
    
        if (r41 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03ce, code lost:
    
        r11 = r73.A10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03da, code lost:
    
        if (((android.view.View) r11.getValue()).getVisibility() == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03dc, code lost:
    
        X.AnonymousClass229.A01(r73.A0f).A14(r1.A00().A00, X.C81X.A0C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03ed, code lost:
    
        r9 = (android.widget.ImageView) r11.getValue();
        r10 = r73.A0G;
        r9.setColorFilter(r10.getColor(X.AbstractC53242c7.A0H(r10, com.facebook.R.attr.igds_color_primary_button_on_media)));
        ((android.widget.ImageView) r11.getValue()).setScaleType(android.widget.ImageView.ScaleType.CENTER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x040e, code lost:
    
        r8 = r73.A10;
        X.C8QC.A05(new android.view.View[]{(android.view.View) r8.getValue()}, r41);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0421, code lost:
    
        if (r2 == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0427, code lost:
    
        if (r75 != r35) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0436, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36327237116574114L) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0438, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0445, code lost:
    
        if (((java.lang.Boolean) r73.A17.getValue()).booleanValue() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0448, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0N}, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0451, code lost:
    
        if (r28 != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0459, code lost:
    
        if (r73.A0n.CWW() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x046a, code lost:
    
        if (r2 == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x046c, code lost:
    
        if (r6 != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0474, code lost:
    
        if (r73.A0i.CWW() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x048b, code lost:
    
        if (r73.A0p.CWW() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x048d, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0p.getView()}, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x049a, code lost:
    
        if (r18 != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04a2, code lost:
    
        if (r73.A0j.CWW() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04b1, code lost:
    
        if (r7 != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04b9, code lost:
    
        if (r73.A0k.CWW() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04c8, code lost:
    
        r9 = r73.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04cc, code lost:
    
        if (r24 == false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04ce, code lost:
    
        r11 = r9.getView();
        X.C8QC.A05(new android.view.View[]{r11}, r1);
        r8 = r73.A0s.A00;
        r8.A1Y.A00().A01(r8.A1t, r11, X.EnumC199188rL.A0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04ea, code lost:
    
        if (r19 != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04f2, code lost:
    
        if (r73.A0h.CWW() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0518, code lost:
    
        r9 = r73.A0b;
        r10 = new android.view.View[]{r9};
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x051e, code lost:
    
        if (r2 == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0520, code lost:
    
        X.C8QC.A05(r10, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0523, code lost:
    
        r12 = X.EnumC1810181d.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0527, code lost:
    
        if (r75 != r12) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0529, code lost:
    
        if (r91 != false) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x052b, code lost:
    
        X.C8QC.A05(new android.view.View[]{r9}, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0532, code lost:
    
        if (r16 != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x053a, code lost:
    
        if (r73.A0o.CWW() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x056b, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0J}, r37);
        X.C8QC.A05(new android.view.View[]{r73.A0I}, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0581, code lost:
    
        if (r2 == false) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0587, code lost:
    
        if (r75 != r35) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0596, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36327237116639651L) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x05a4, code lost:
    
        if (((java.lang.Boolean) r73.A17.getValue()).booleanValue() != false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05ac, code lost:
    
        if ((r1.A00() instanceof X.C81V) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x05ae, code lost:
    
        r6 = r73.A0G;
        r43 = r6.getString(2131972699);
        X.C14360o3.A07(r43);
        r50 = r1;
        r1.add(new X.C199928sw(null, r6.getDrawable(com.facebook.R.drawable.instagram_download_pano_outline_24), null, new X.C23937AjX(r73), null, r43, 0, 0, 0, false, false, false, r50, false, false, false));
        r43 = r6.getString(2131972719);
        X.C14360o3.A07(r43);
        r1.add(new X.C199928sw(null, r6.getDrawable(com.facebook.R.drawable.instagram_draft_pano_outline_24), null, new X.C23938AjY(r73), null, r43, 0, 0, 0, false, false, false, r50, false, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0610, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0615, code lost:
    
        if (r1.isEmpty() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0618, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0K}, r6);
        r73.A0t.EhF(r22, false);
        r6 = r73.A0x;
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x062c, code lost:
    
        if (r22 == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x062e, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x062f, code lost:
    
        r6.setVisibility(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0634, code lost:
    
        if (r3.A04 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0638, code lost:
    
        if (r3.A0g != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x063c, code lost:
    
        if (r3.A0P == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x064d, code lost:
    
        r29 = r65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x064f, code lost:
    
        X.C8QC.A04(r73.A0T, r29);
        r5 = r73.A0U;
        r3 = new android.view.View[]{r5};
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x065c, code lost:
    
        if (r2 == false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x065e, code lost:
    
        X.C8QC.A05(r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0661, code lost:
    
        if (r80 == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0663, code lost:
    
        if (r14 == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0665, code lost:
    
        r73.A0s.A0D(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0670, code lost:
    
        if (r1.A03() != X.C05F.A1I) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0672, code lost:
    
        r5.setImageResource(com.facebook.R.drawable.instagram_music_outline_44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0678, code lost:
    
        r3 = r73.A0W;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x067f, code lost:
    
        if (r3.getVisibility() != 0) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0681, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0682, code lost:
    
        if (r2 == false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0688, code lost:
    
        if (r75 != r35) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0696, code lost:
    
        if (((java.lang.Boolean) r73.A17.getValue()).booleanValue() != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0698, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0699, code lost:
    
        if (r20 != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x069c, code lost:
    
        X.C8QC.A05(new android.view.View[]{r3}, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06a3, code lost:
    
        if (r20 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06a5, code lost:
    
        if (r7 == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x06a7, code lost:
    
        if (r80 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x06a9, code lost:
    
        r3.sendAccessibilityEvent(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x06ac, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0V}, r27);
        X.C8QC.A05(new android.view.View[]{r1.A00.A1E.A00}, r23);
        r7 = r73.A0Z;
        X.C8QC.A05(new android.view.View[]{r7}, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x06d3, code lost:
    
        if (r26 == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x06d5, code lost:
    
        r7.setImageDrawable(A00(r73));
        r5 = r73.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x06de, code lost:
    
        if (r88 == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06e0, code lost:
    
        r5 = r5.A00;
        r5.A1Y.A00().A01(r5.A1t, r7, X.EnumC199188rL.A12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06ef, code lost:
    
        r7 = r73.A12;
        X.C8QC.A05(new android.view.View[]{(android.view.View) r7.getValue()}, r31);
        r6 = r73.A11;
        X.C8QC.A05(new android.view.View[]{(android.view.View) r6.getValue()}, r30);
        r5 = r73.A14;
        X.C8QC.A05(new android.view.View[]{(android.view.View) r5.getValue()}, r15);
        X.C8QC.A05(new android.view.View[]{r73.A0Y}, r32);
        X.C8QC.A05(new android.view.View[]{r73.A0a}, r33);
        r8 = r73.A0H;
        r9 = new android.view.View[]{r8};
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x073c, code lost:
    
        if (r2 == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x073e, code lost:
    
        X.C8QC.A05(r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0741, code lost:
    
        r2 = r73.A0f;
        X.C8QC.A01(r73.A0S, r2, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x074c, code lost:
    
        if (r75 != r12) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x074e, code lost:
    
        if (r91 != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0750, code lost:
    
        X.C8QC.A05(new android.view.View[]{r8}, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0757, code lost:
    
        A0F(r73);
        A0G(r73);
        A0E(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0764, code lost:
    
        if (r8.getVisibility() != 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0766, code lost:
    
        r10 = r73.A0u;
        r9 = r10.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x076c, code lost:
    
        if (r9 == null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0770, code lost:
    
        if (r9.A01 != r1) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x07e9, code lost:
    
        r10 = r10.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x07ed, code lost:
    
        if (r10 == null) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x07ef, code lost:
    
        r11 = A0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x07f5, code lost:
    
        if (r73.A06 != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x07f7, code lost:
    
        if (r89 == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x07f9, code lost:
    
        r73.A06 = r1;
        r13 = X.EnumC199188rL.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x07fd, code lost:
    
        r10.A02(r11, r8, r13, X.C21B.A00(r2), null, 0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x080e, code lost:
    
        if (r73.A19 == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0810, code lost:
    
        r13 = X.EnumC199188rL.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0813, code lost:
    
        r13 = X.EnumC199188rL.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0772, code lost:
    
        r10 = X.AbstractC16960so.A1Q(new X.C09530e4(r7.getValue(), X.EnumC199188rL.A0h), new X.C09530e4(r6.getValue(), X.EnumC199188rL.A0g), new X.C09530e4(r5.getValue(), X.EnumC199188rL.A0j), new X.C09530e4(r8.getValue(), X.EnumC199188rL.A0A)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x07ae, code lost:
    
        if (r10.hasNext() == false) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x07b0, code lost:
    
        r5 = (X.C09530e4) r10.next();
        r4 = r73.A0u;
        r2 = r4.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x07bc, code lost:
    
        if (r2 == null) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x07c0, code lost:
    
        if (r2.A01 != r1) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x07c3, code lost:
    
        r9 = (android.view.View) r5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x07cb, code lost:
    
        if (r9.getVisibility() != 0) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x07cd, code lost:
    
        r8 = r4.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x07d1, code lost:
    
        if (r8 == null) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x07d3, code lost:
    
        r7 = A0O();
        r6 = (X.EnumC199188rL) r5.A01;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x07e2, code lost:
    
        if (r74.A01 != X.C22P.A2x) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x07e4, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x07e5, code lost:
    
        r8.A03(r7, r9, r6, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0d6f, code lost:
    
        r5 = r73.A0G.getResources();
        r2 = r1.getLayoutParams();
        X.C14360o3.A0C(r2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        r2 = (android.view.ViewGroup.MarginLayoutParams) r2;
        r7 = r2.getMarginEnd() + r2.getMarginStart();
        A0I(r73);
        ((X.C199248rR) r73.A16.getValue()).A00(r1, (android.view.View[]) java.util.Arrays.copyOf(A0N(r73), 29), r7, r5.getDimensionPixelSize(com.facebook.R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), r5.getDimensionPixelSize(com.facebook.R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        r1 = A0M(r73);
        r0 = com.facebook.R.drawable.instagram_chevron_left_pano_outline_rtl_24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0dbb, code lost:
    
        if (r1 == false) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0dbd, code lost:
    
        r0 = com.facebook.R.drawable.instagram_x_outline_44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0dc0, code lost:
    
        r3.setImageResource(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0dc3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0816, code lost:
    
        X.C8QC.A05(r9, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x069b, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x081d, code lost:
    
        X.C8QC.A05(new android.view.View[]{r3}, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0828, code lost:
    
        if (r14 == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x082c, code lost:
    
        X.C8QC.A05(r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x064b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36325089632858846L) != false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0617, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0831, code lost:
    
        if (r38 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0833, code lost:
    
        r9 = r1.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0839, code lost:
    
        if (r9 != X.C208509Kk.A00) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x083b, code lost:
    
        if (r7 == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x084a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36319330081971386L) == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x084c, code lost:
    
        A03(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x084f, code lost:
    
        if (r37 == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0851, code lost:
    
        A05(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0854, code lost:
    
        if (r5 == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0856, code lost:
    
        A08(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0859, code lost:
    
        r8 = r73.A0f;
        r7 = X.C06090Tz.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0866, code lost:
    
        if (X.C18U.A06(r7, r8, 36324411028025500L) == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0868, code lost:
    
        A07(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x086b, code lost:
    
        A0A(r73);
        A0B(r73);
        A06(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0874, code lost:
    
        if (r16 == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x087f, code lost:
    
        if (X.C18U.A06(r7, r8, 36327847001930667L) != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0881, code lost:
    
        A09(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0888, code lost:
    
        if ((r9 instanceof X.C81V) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x088a, code lost:
    
        if (r18 == false) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x088c, code lost:
    
        A03(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x088f, code lost:
    
        if (r6 == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0891, code lost:
    
        A04(r73);
        A0C(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0897, code lost:
    
        if (r17 == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0899, code lost:
    
        A0D(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x089c, code lost:
    
        if (r5 == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x089e, code lost:
    
        A08(r73);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x053c, code lost:
    
        r10 = X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36327847001930667L);
        r9 = r73.A0o;
        X.C8QC.A05(new android.view.View[]{r9.getView()}, r10);
        r8 = r73.A0s;
        r11 = r9.getView();
        r8 = r8.A00;
        r8.A1Y.A00().A01(r8.A1t, r11, X.EnumC199188rL.A11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x08a3, code lost:
    
        X.C8QC.A05(r10, r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x04f4, code lost:
    
        r9 = r73.A0h;
        X.C8QC.A05(new android.view.View[]{r9.getView()}, r19);
        r8 = r73.A0s;
        r11 = r9.getView();
        r8 = r8.A00;
        r8.A1Y.A00().A01(r8.A1t, r11, X.EnumC199188rL.A0J);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x08ae, code lost:
    
        if (r9.CGb() == 8) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x08b0, code lost:
    
        X.C8QC.A05(new android.view.View[]{r9.getView()}, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x04bb, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0k.getView()}, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x04a4, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0j.getView()}, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0476, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0i.getView()}, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0483, code lost:
    
        if (r6 != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08bd, code lost:
    
        if (r6 != false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08c5, code lost:
    
        if (r73.A0i.CWW() == false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08dc, code lost:
    
        if (r73.A0p.CWW() == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x08de, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0p.getView()}, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x08eb, code lost:
    
        if (r18 != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x08f3, code lost:
    
        if (r73.A0j.CWW() == false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0904, code lost:
    
        if (r7 != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x090c, code lost:
    
        if (r73.A0k.CWW() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x090e, code lost:
    
        r9 = r73.A0k;
        X.C8QC.A05(new android.view.View[]{r9.getView()}, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0923, code lost:
    
        if (r9.getView().getVisibility() != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0925, code lost:
    
        r10 = r73.A0u;
        r8 = r10.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x092b, code lost:
    
        if (r8 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x092f, code lost:
    
        if (r8.A01 != r1) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0933, code lost:
    
        r11 = r10.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0937, code lost:
    
        if (r11 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0939, code lost:
    
        r11.A01(A0O(), r9.getView(), X.EnumC199188rL.A0B);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x08f5, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0j.getView()}, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x08c7, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0i.getView()}, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x08d4, code lost:
    
        if (r6 != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x045b, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0n.getView()}, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0447, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0948, code lost:
    
        X.C8QC.A05(new android.view.View[]{r73.A0N}, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0953, code lost:
    
        X.AnonymousClass229.A01(r73.A0f).A14(r1.A00().A00, X.C81X.A0D);
        r10 = r73.A0l;
        r9 = r10.getView().requireViewById(com.facebook.R.id.post_capture_camera_genai_expand_button);
        X.C14360o3.A0C(r9, "null cannot be cast to non-null type android.widget.ImageView");
        r9 = (android.widget.ImageView) r9;
        r11 = r73.A0G;
        r9.setColorFilter(r11.getColor(X.AbstractC53242c7.A0H(r11, com.facebook.R.attr.igds_color_primary_button_on_media)));
        r9.setScaleType(android.widget.ImageView.ScaleType.CENTER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x03a1, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0992, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0995, code lost:
    
        if (r3.A0G == null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0997, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0998, code lost:
    
        r4 = r1.A00();
        r9 = X.C208509Kk.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x099e, code lost:
    
        if (r4 != r9) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x09a0, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x09af, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36327847001865130L) != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x09b3, code lost:
    
        r5 = r3.A0D;
        r29 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x09b9, code lost:
    
        if (r5 == r29) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x09bb, code lost:
    
        if (r12 != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x09bf, code lost:
    
        if (r3.A0V != false) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x09c7, code lost:
    
        if (r1.A03() != X.C05F.A0N) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:
    
        if (r6 != X.EnumC189548aZ.A06) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x09c9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x09d0, code lost:
    
        if (X.C6PX.A00(r73.A0G) != false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x09d3, code lost:
    
        r4 = r3.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x09d7, code lost:
    
        if (r4 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x09d9, code lost:
    
        r4 = r4.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x09db, code lost:
    
        if (r4 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x09dd, code lost:
    
        r4 = r4.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x09df, code lost:
    
        if (r4 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x09e5, code lost:
    
        if (r4.booleanValue() != false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x09f5, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x09fa, code lost:
    
        if (r1.A00() == r9) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x09fc, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x09fd, code lost:
    
        if (r7 != false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x09ff, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0a01, code lost:
    
        if (r5 == false) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0a05, code lost:
    
        if (r12 != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0a07, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0a0d, code lost:
    
        if (r1.A0C() != false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0a15, code lost:
    
        if (r1.A0E() != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0a17, code lost:
    
        r7 = r73.A0f;
        r5 = X.AbstractC60292pC.A00(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0a1d, code lost:
    
        if (r5 == null) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0a21, code lost:
    
        if (r5.A00 <= 0) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0a27, code lost:
    
        if (X.AbstractC60292pC.A03(r7, r5) == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0a29, code lost:
    
        r19 = false;
        r24 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0a2d, code lost:
    
        r8 = r1.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0a31, code lost:
    
        if (r30 != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0a39, code lost:
    
        if (r74.A01 == X.C22P.A2D) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0a3b, code lost:
    
        if (r6 != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0a3d, code lost:
    
        if (r87 != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0a41, code lost:
    
        if (r3.A0r != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0a49, code lost:
    
        if (X.C6PX.A00(r73.A0G) == false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0a5b, code lost:
    
        if (X.AbstractC198458pu.A00(r73.A0f, r8, false).A00(r73.A1B, r73.A02) == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016d, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0a5d, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0a5e, code lost:
    
        if (r31 == false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0a61, code lost:
    
        if (r79 != false) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0a63, code lost:
    
        if (r83 != false) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a6b, code lost:
    
        if (r1.A03() != X.C05F.A1I) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0a6d, code lost:
    
        r4 = r73.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a6f, code lost:
    
        if (r4 == null) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0a73, code lost:
    
        if (r4.A04 == null) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0d50, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0d5f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36323741013519939L) != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0a77, code lost:
    
        if (r2 != false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0a79, code lost:
    
        if (r18 == false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a7b, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0a7c, code lost:
    
        r4 = r73.A0G;
        r6 = r73.A0f;
        r12 = r73.A02.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0a8a, code lost:
    
        if (X.C14360o3.A0K(r8, r9) == false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a8c, code lost:
    
        r5 = r12.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0a90, code lost:
    
        if (r5.A0g != null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0a94, code lost:
    
        if (r5.A0P != false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0a98, code lost:
    
        if (r5.A0J == false) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0a9a, code lost:
    
        r43 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0a9c, code lost:
    
        r42 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0aa2, code lost:
    
        if (X.C14360o3.A0K(r8, r9) == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0aae, code lost:
    
        if (r73.A02.A02.A01() != X.EnumC198268pb.A04) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0abb, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36329410369962308L) == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0abd, code lost:
    
        r4 = r73.A0v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0abf, code lost:
    
        if (r4 == null) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0acd, code lost:
    
        if (((java.lang.Boolean) r4.A00.getValue()).booleanValue() != r1) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0acf, code lost:
    
        r41 = X.C199148rH.A00.A00(r6, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0adb, code lost:
    
        if (X.C8QC.A07(r1) == false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0add, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0ae4, code lost:
    
        if (r74.A01 != X.C22P.A2D) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0ae7, code lost:
    
        r27 = r1.A03();
        r20 = !r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0af1, code lost:
    
        if (r1.A0B() != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0af7, code lost:
    
        if (r3.A02() == null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0af9, code lost:
    
        r4 = r3.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0afd, code lost:
    
        if (r4 == null) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b01, code lost:
    
        if (r4.A0F != r1) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0b03, code lost:
    
        if (r26 != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b0b, code lost:
    
        if (r74.A01 == X.C22P.A2D) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b0d, code lost:
    
        if (r10 != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0b0f, code lost:
    
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b13, code lost:
    
        if ((r8 instanceof X.C81V) == false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0b19, code lost:
    
        if (r73.A0F != false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0b1b, code lost:
    
        r4 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b33, code lost:
    
        if ((!X.AbstractC199158rI.A00(r4.A15, ((X.C8NW) r4.A1h.get()).A16())) == false) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b38, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b39, code lost:
    
        r73.A0F = r4;
        r4 = r1.A00;
        r22 = X.C183688Ct.A0P(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0b43, code lost:
    
        if (r30 != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0b45, code lost:
    
        if (r17 != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0b47, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0b49, code lost:
    
        if (r31 == false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0b4d, code lost:
    
        if (r26 == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0b4f, code lost:
    
        if (r23 == false) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0b55, code lost:
    
        r39 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0b5b, code lost:
    
        if (r4.A1E.A00 == null) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0b63, code lost:
    
        if (r1.A03() == X.C05F.A1I) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0b65, code lost:
    
        if (r30 != false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0b67, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0b69, code lost:
    
        if (r17 == false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0b6d, code lost:
    
        if (r79 != false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0b6f, code lost:
    
        if (r83 != false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0b77, code lost:
    
        if (r1.A03() != X.C05F.A1I) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0b79, code lost:
    
        r4 = r73.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0b7b, code lost:
    
        if (r4 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0b7f, code lost:
    
        if (r4.A04 == null) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0cc6, code lost:
    
        if (r8 != X.C1811181n.A00) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0cca, code lost:
    
        if (r73.A1F != false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0ccc, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0cd1, code lost:
    
        if (X.C36A.A08(r6) != false) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0b82, code lost:
    
        if (r8 != r9) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0b8a, code lost:
    
        if (r74.A01 == X.C22P.A2D) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0b8c, code lost:
    
        if (r17 != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0b8e, code lost:
    
        if (r10 != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0b98, code lost:
    
        if (X.AbstractC180467za.A00(r6).booleanValue() == false) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0ba5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36319330081709241L) == false) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0ba7, code lost:
    
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0ba9, code lost:
    
        r4 = r1.A03();
        r9 = X.C05F.A1I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0baf, code lost:
    
        if (r4 != r9) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0bb1, code lost:
    
        if (r14 == false) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0bb3, code lost:
    
        r40 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0bb9, code lost:
    
        if (X.C36A.A02(r6) == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0bc1, code lost:
    
        if (r1.A03() == r9) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0bc3, code lost:
    
        if (r30 != false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0bcb, code lost:
    
        if (r74.A01 == X.C22P.A2D) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0bcd, code lost:
    
        if (r17 != false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0bcf, code lost:
    
        if (r10 == false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0bdd, code lost:
    
        r38 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0bdf, code lost:
    
        r4 = r3.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0be3, code lost:
    
        if (r4 == null) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0be9, code lost:
    
        if (r4.A0E() != r1) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0beb, code lost:
    
        r31 = false;
        r30 = false;
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0bf0, code lost:
    
        r32 = X.AbstractC199178rK.A00(r6, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0bfa, code lost:
    
        if (r1.A03() != r9) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0bfc, code lost:
    
        r4 = r73.A1D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0bfe, code lost:
    
        if (r4 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0c00, code lost:
    
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0c08, code lost:
    
        if (r4.A01() == X.EnumC189548aZ.A06) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0c0c, code lost:
    
        r17 = r40;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0c0a, code lost:
    
        r33 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0c11, code lost:
    
        r4 = X.C199168rJ.A00;
        r12 = r74.A01;
        r11 = r1.A01();
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0c20, code lost:
    
        if (r3.A02() == null) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0c22, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0c27, code lost:
    
        if (r4.A00(r12, r8, r11, r10) == false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0c29, code lost:
    
        r11 = A01(r73);
        r13 = new java.util.ArrayList(X.AbstractC06950Ym.A1E(r11, 10));
        r30 = r11.iterator();
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0c41, code lost:
    
        if (r30.hasNext() == false) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0c43, code lost:
    
        r10 = r30.next();
        r17 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0c49, code lost:
    
        if (r12 >= 0) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0c53, code lost:
    
        r10 = (X.EnumC193878i8) r10;
        r50 = r4.getString(r10.A04);
        X.C14360o3.A07(r50);
        r13.add(new X.C199928sw(null, r4.getDrawable(r10.A00), null, new X.C23952Ajm(r73, r10, r12), null, r50, 0, 0, 0, false, false, false, r1, false, false, false));
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0c4b, code lost:
    
        X.AbstractC16960so.A1U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0c52, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0c94, code lost:
    
        ((X.C8QJ) r73.A13.getValue()).A02(r13);
        r31 = r4.A02(r6);
        r30 = r4.A01(r6);
        r15 = r4.A03(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0bd5, code lost:
    
        if (r1.A03() != r9) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0bd7, code lost:
    
        if (r2 != false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0bd9, code lost:
    
        if (r40 == false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0bdb, code lost:
    
        if (r5 == false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0cad, code lost:
    
        r38 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0bbb, code lost:
    
        r40 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0cbc, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r6, 36323895631949486L) == false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0cc0, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0b81, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0b6b, code lost:
    
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0b51, code lost:
    
        r39 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0b53, code lost:
    
        if (r31 == false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0b4b, code lost:
    
        r25 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0b35, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0b36, code lost:
    
        if (r80 == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0b15, code lost:
    
        r37 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0ae6, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0cd5, code lost:
    
        r42 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0cd9, code lost:
    
        r4 = r12.A01;
        r12 = r4.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0ce1, code lost:
    
        if (r12 == null) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d0, code lost:
    
        if (r3.A0P == false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0ce7, code lost:
    
        if (X.C14360o3.A0K(r9, r8) == false) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0ce9, code lost:
    
        r4 = r4.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0ceb, code lost:
    
        if (r4 == null) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0cf9, code lost:
    
        if (((java.util.Set) r4.A09.A00).contains(X.C81W.A0C) == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0cfd, code lost:
    
        r5 = (r12.A09 * 1.0f) / r12.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0d09, code lost:
    
        if ((r12.A07 % 180) == 0) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0d0b, code lost:
    
        r5 = 1.0f / r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0d19, code lost:
    
        if (java.lang.Math.abs(r5 - 0.5625f) < 0.01f) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0d1b, code lost:
    
        r4 = X.AbstractC185688Ln.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0d39, code lost:
    
        if (r4 == false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0d3b, code lost:
    
        r43 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0d3d, code lost:
    
        if (r10 == false) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0d24, code lost:
    
        if (r4.A04() == null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0d33, code lost:
    
        if (((r4.A0K * 1.0f) / r4.A08) < 0.5725f) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0d35, code lost:
    
        r4 = X.C14360o3.A0K(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0d41, code lost:
    
        if (r7 == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0d43, code lost:
    
        if (r20 == false) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0d45, code lost:
    
        X.AnonymousClass229.A01(r73.A0f).A0g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0a75, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0a60, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0d63, code lost:
    
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0a0f, code lost:
    
        r24 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0a03, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x09e7, code lost:
    
        r5 = r3.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x09eb, code lost:
    
        if (r5 == null) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x09ef, code lost:
    
        if (r5.A1I != false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x09f3, code lost:
    
        if (r5.A13 == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x09d2, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x09b1, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x033c, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0330, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0319, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r73.A0f, 36316783166362259L) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x02b2, code lost:
    
        if (r82 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01dd, code lost:
    
        if (X.C18U.A06(r5, r1.A0J, 36325089632858846L) == false) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026b, code lost:
    
        if (r5.A08().A02 != true) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0281, code lost:
    
        if (r73.A0k.CGb() != 0) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0P(X.AnonymousClass840 r74, X.EnumC1810181d r75, X.EnumC1810381f r76, java.lang.Integer r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, boolean r89, boolean r90, boolean r91) {
        /*
            Method dump skipped, instructions count: 3652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8Q6.A0P(X.840, X.81d, X.81f, java.lang.Integer, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}

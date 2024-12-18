package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.8Ry, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187318Ry implements InterfaceC187208Rn, InterfaceC55932he, InterfaceC187328Rz {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public SwitchCompat A05;
    public C8S3 A06;
    public IgdsMediaButton A07;
    public C5SW A08;
    public ComposerAutoCompleteTextView A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final int A0F;
    public final Context A0G;
    public final PaintDrawable A0H;
    public final View A0I;
    public final View A0J;
    public final C8SB A0K;
    public final RecyclerView A0L;
    public final C3F0 A0M;
    public final InterfaceC11380iw A0N;
    public final UserSession A0O;
    public final TouchInterceptorFrameLayout A0P;
    public final InterfaceC56392iX A0Q;
    public final InterfaceC159417Dc A0R;
    public final C8SE A0S;
    public final InterfaceC187288Rv A0T;
    public final C7VZ A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final int A0c;
    public final View A0d;
    public final LinearLayoutManager A0e;
    public final InterfaceC56392iX A0f;
    public final C8S0 A0g;
    public final C8S7 A0h;
    public final C8S1 A0i;
    public final InterfaceC16820sZ A0j;
    public final InterfaceC16820sZ A0k;
    public final boolean A0l;
    public final boolean A0m;

    @Override // X.InterfaceC187328Rz
    public final void DNZ(C9V0 c9v0) {
        C5SW c5sw = this.A08;
        if (c5sw != null && c5sw.A09()) {
            c5sw.A08(false);
        }
        int i = this.A00;
        if (i == 2 || i == 3 || i == 5) {
            if (!this.A0D) {
                A05(this, c9v0.getLayoutPosition());
                int layoutPosition = c9v0.getLayoutPosition();
                this.A01 = layoutPosition;
                this.A02 = layoutPosition;
                this.A0K.A07(c9v0);
                C448724r c448724r = AnonymousClass229.A01(this.A0O).A0F;
                C18920wW c18920wW = c448724r.A01;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
                if (A00.isSampled()) {
                    A00.A8R(C81X.A25, "tool_type");
                    A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_SELECT_SEGMENT_TAP");
                    C22M c22m = c448724r.A04;
                    String str = c22m.A0L;
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("camera_session_id", str);
                    A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A00.A8p("event_type", 2);
                    A00.A8R(c22m.A0C, "surface");
                    A00.A8R(AnonymousClass249.VIDEO, "media_type");
                    A00.AAP("module", C22F.A09.getModuleName());
                    A00.A8R(c448724r.A0J(), "camera_destination");
                    A00.A8R(c448724r.A0I(), "capture_type");
                    A00.AAP("nav_chain", C1QM.A00.A02.A00);
                    A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
                    A00.Cht();
                }
            }
            A07(c9v0, c9v0.getLayoutPosition());
        }
    }

    @Override // X.InterfaceC187208Rn
    public final void DO2(List list) {
        int i;
        boolean z = false;
        C14360o3.A0B(list, 0);
        this.A0S.notifyDataSetChanged();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            GalleryItem galleryItem = ((C9NH) listIterator.previous()).A01;
            if (galleryItem.A06() || galleryItem.A03() || galleryItem.A06 != null) {
                i = listIterator.nextIndex();
                break;
            }
        }
        i = -1;
        boolean z2 = false;
        RecyclerView recyclerView = this.A0L;
        if (i == -1) {
            recyclerView.A0n(0);
        } else {
            recyclerView.A0o(i);
        }
        InterfaceC187288Rv interfaceC187288Rv = this.A0T;
        if (interfaceC187288Rv.getCanHaveEmptySegments()) {
            if (i != -1) {
                z2 = true;
            }
            InterfaceC09390do interfaceC09390do = this.A0Y;
            double d = ((C55982hj) interfaceC09390do.getValue()).A01;
            if (interfaceC187288Rv.Ceo()) {
                if (z2) {
                    A08(false);
                } else {
                    A08(true);
                }
                AbstractC125325le.A04(null, new View[]{this.A0P}, false);
                ((C55982hj) interfaceC09390do.getValue()).A08(d, true);
                return;
            }
            A08(false);
        } else {
            z2 = !list.isEmpty();
            z = this.A0l;
        }
        View[] viewArr = {this.A0P};
        if (z2) {
            AbstractC125325le.A04(null, viewArr, z);
        } else {
            AbstractC125325le.A05(viewArr, z);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0P;
        touchInterceptorFrameLayout.setTranslationY((1.0f - f) * touchInterceptorFrameLayout.getHeight());
        touchInterceptorFrameLayout.setAlpha(f);
    }

    private final void A00() {
        String str;
        C8SE c8se = this.A0S;
        boolean z = true;
        if (c8se.getItemCount() > 1) {
            Integer num = this.A0A;
            Integer num2 = C05F.A00;
            if ((num != num2 || c8se.getItemCount() <= this.A0F) && this.A0T.Ejf()) {
                UserSession userSession = this.A0O;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36328134764674259L)) {
                    if (this.A05 == null) {
                        InterfaceC56392iX interfaceC56392iX = this.A0Q;
                        this.A05 = (SwitchCompat) interfaceC56392iX.getView().requireViewById(R.id.destination_switch);
                        View requireViewById = interfaceC56392iX.getView().requireViewById(R.id.carousel_switch_selection);
                        C14360o3.A07(requireViewById);
                        IgTextView igTextView = (IgTextView) requireViewById;
                        View requireViewById2 = interfaceC56392iX.getView().requireViewById(R.id.reel_switch_selection);
                        C14360o3.A07(requireViewById2);
                        IgTextView igTextView2 = (IgTextView) requireViewById2;
                        if (C18U.A06(c06090Tz, userSession, 36328134764739796L)) {
                            Context context = this.A0G;
                            igTextView.setText(context.getString(2131963130));
                            igTextView2.setText(context.getString(2131963132));
                        }
                        igTextView2.setActivated(true);
                        igTextView.setActivated(false);
                        SwitchCompat switchCompat = this.A05;
                        str = "typeSelectorSwitch";
                        if (switchCompat != null) {
                            switchCompat.setTextOn(igTextView.getText());
                            SwitchCompat switchCompat2 = this.A05;
                            if (switchCompat2 != null) {
                                switchCompat2.setTextOff(igTextView2.getText());
                                SwitchCompat switchCompat3 = this.A05;
                                if (switchCompat3 != null) {
                                    C0fQ.A00(new ViewOnClickListenerC23199AQi(this), switchCompat3);
                                    SwitchCompat switchCompat4 = this.A05;
                                    if (switchCompat4 != null) {
                                        switchCompat4.setOnCheckedChangeListener(new C23285ATv(igTextView, igTextView2, this));
                                    }
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    SwitchCompat switchCompat5 = this.A05;
                    str = "typeSelectorSwitch";
                    if (switchCompat5 != null) {
                        if (c8se.getItemCount() > this.A0F && this.A0A == num2) {
                            z = false;
                        }
                        switchCompat5.setEnabled(z);
                        InterfaceC56392iX interfaceC56392iX2 = this.A0Q;
                        if (interfaceC56392iX2.CGb() != 0) {
                            C448824s c448824s = AnonymousClass229.A01(userSession).A0G;
                            C18920wW c18920wW = c448824s.A01;
                            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_impression");
                            if (A00.isSampled()) {
                                A00.A8R(C81X.A0Z, "tool_type");
                                String str2 = c448824s.A04.A0L;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                A00.AAP("camera_session_id", str2);
                                A00.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                                A00.A8R(EnumC50631MWs.A0C, "surface");
                                A00.AAP("module", C22F.A08.getModuleName());
                                A00.Cht();
                            }
                        }
                        interfaceC56392iX2.setVisibility(0);
                        C8S7 c8s7 = this.A0h;
                        SwitchCompat switchCompat6 = this.A05;
                        if (switchCompat6 != null) {
                            c8s7.A00 = switchCompat6.getHeight() + (this.A0G.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
        }
        if (this.A05 == null) {
            return;
        }
        this.A0Q.setVisibility(8);
        SwitchCompat switchCompat7 = this.A05;
        if (switchCompat7 != null) {
            switchCompat7.setChecked(false);
        }
        this.A0h.A00 = 0;
    }

    public static final void A01(C187318Ry c187318Ry) {
        C8S3 c8s3 = c187318Ry.A06;
        if (c8s3 instanceof C8S2) {
            C14360o3.A0C(c8s3, "null cannot be cast to non-null type com.instagram.creation.common.ui.thumbnailtray.MediaThumbnailItemDeletionAndDuplicationMenu");
            C8S2 c8s2 = (C8S2) c8s3;
            boolean z = false;
            if (c187318Ry.A0R.getCount() < 10) {
                z = true;
            }
            FrameLayout frameLayout = c8s2.A00;
            if (frameLayout != null) {
                float f = 0.4f;
                if (z) {
                    f = 1.0f;
                }
                frameLayout.setAlpha(f);
            }
        }
    }

    public static final void A02(C187318Ry c187318Ry) {
        boolean z;
        View view = c187318Ry.A07;
        if (view == null || !c187318Ry.A0b) {
            view = c187318Ry.A0J;
        }
        int width = view.getWidth();
        if (c187318Ry.A0T.Ceo()) {
            boolean z2 = c187318Ry.A0Z;
            InterfaceC09390do interfaceC09390do = c187318Ry.A0V;
            int visibility = ((View) interfaceC09390do.getValue()).getVisibility();
            if (z2) {
                if (visibility == 0) {
                    AbstractC13880nE.A0Z((View) interfaceC09390do.getValue(), width);
                }
            } else if (visibility == 0) {
                AbstractC13880nE.A0b((View) interfaceC09390do.getValue(), width);
            }
            z = true;
        } else {
            z = false;
        }
        c187318Ry.A08(z);
    }

    public static final void A03(C187318Ry c187318Ry) {
        Context context;
        boolean booleanValue = ((Boolean) c187318Ry.A0k.invoke()).booleanValue();
        View view = c187318Ry.A0J;
        if (booleanValue) {
            Context context2 = c187318Ry.A0G;
            view.setPadding(context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, context2.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0);
            TextView textView = (TextView) view.findViewById(R.id.media_thumbnail_tray_button_text);
            textView.setText("");
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.instagram_arrow_right_pano_filled_24, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(context2.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
            return;
        }
        TextView textView2 = (TextView) view.findViewById(R.id.media_thumbnail_tray_button_text);
        textView2.setText(c187318Ry.A0c);
        view.setContentDescription(textView2.getText().toString());
        textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.chevron_right, 0);
        Drawable[] compoundDrawablesRelative = textView2.getCompoundDrawablesRelative();
        Drawable drawable = compoundDrawablesRelative[0];
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        Drawable drawable2 = compoundDrawablesRelative[2];
        if (drawable2 != null) {
            drawable2.setAutoMirrored(true);
        }
        C8S0 c8s0 = c187318Ry.A0g;
        if (c8s0 == null) {
            return;
        }
        ViewStub viewStub = (ViewStub) c187318Ry.A0P.findViewById(R.id.media_thumbnail_tray_avatar_view_stub);
        C14360o3.A0A(viewStub);
        View view2 = c187318Ry.A0f.getView();
        C14360o3.A0B(viewStub, 0);
        ImageUrl imageUrl = null;
        textView2.setCompoundDrawables(null, null, null, null);
        if (view2 != null) {
            AbstractC13880nE.A0c(view2, view2.getPaddingStart());
        }
        viewStub.setLayoutResource(R.layout.direct_multi_media_tray_button_stacked_avatar);
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.stackedavatar.StackedAvatarView");
        StackedAvatarView stackedAvatarView = (StackedAvatarView) inflate;
        DirectCameraViewModel directCameraViewModel = c8s0.A01;
        boolean z = directCameraViewModel.A07;
        if (z && directCameraViewModel.A01 != null) {
            context = stackedAvatarView.getContext();
            stackedAvatarView.A03(context, R.dimen.abc_dialog_padding_top_material);
            stackedAvatarView.setPadding(0, 6, 0, 0);
        } else {
            context = stackedAvatarView.getContext();
            stackedAvatarView.A03(context, R.dimen.abc_dialog_padding_material);
        }
        ImageUrl imageUrl2 = directCameraViewModel.A02;
        if (z) {
            imageUrl = directCameraViewModel.A01;
        }
        stackedAvatarView.setUrls(imageUrl2, imageUrl, c8s0.A00);
        stackedAvatarView.setRingColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_on_media)));
    }

    public static final void A04(final C187318Ry c187318Ry, int i) {
        View view = c187318Ry.A0J;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        View view2 = c187318Ry.A07;
        if (view2 == null || !c187318Ry.A0b) {
            view2 = view;
        }
        int width = view2.getWidth();
        if (c187318Ry.A0T.getCanHaveEmptySegments()) {
            int i2 = width + dimensionPixelSize;
            View view3 = c187318Ry.A04;
            view3.setBackgroundColor(view.getContext().getColor(i));
            AbstractC13880nE.A0g(view3, i2);
            RecyclerView recyclerView = c187318Ry.A0L;
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (c187318Ry.A0Z) {
                marginLayoutParams.setMargins(i2, 0, 0, 0);
            } else {
                marginLayoutParams.setMargins(0, 0, i2, 0);
            }
            recyclerView.setLayoutParams(marginLayoutParams);
            return;
        }
        final int color = view.getContext().getColor(R.color.black_25_transparent);
        ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: X.9Sw
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public final Shader resize(int i3, int i4) {
                float f;
                int i5;
                C187318Ry c187318Ry2 = C187318Ry.this;
                if (c187318Ry2.A0Z) {
                    f = i3;
                    i5 = i3 - c187318Ry2.A0E;
                } else {
                    f = 0.0f;
                    i5 = c187318Ry2.A0E;
                }
                return new LinearGradient(f, 0.0f, i5, 0.0f, new int[]{0, color}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
        };
        PaintDrawable paintDrawable = c187318Ry.A0H;
        paintDrawable.setShaderFactory(shaderFactory);
        View view4 = c187318Ry.A04;
        view4.setBackground(paintDrawable);
        AbstractC13880nE.A0g(view4, width + dimensionPixelSize + c187318Ry.A0E);
    }

    public static final void A05(C187318Ry c187318Ry, int i) {
        int Bsl;
        int i2 = c187318Ry.A00;
        if ((i2 != 1 && i2 != 3 && i2 != 4 && i2 != 5) || i < 0) {
            return;
        }
        InterfaceC159417Dc interfaceC159417Dc = c187318Ry.A0R;
        if (i >= interfaceC159417Dc.getCount() || i == (Bsl = interfaceC159417Dc.Bsl())) {
            return;
        }
        C8SE c8se = c187318Ry.A0S;
        c8se.notifyItemChanged(Bsl);
        LinearLayoutManager linearLayoutManager = c187318Ry.A0e;
        if (i >= linearLayoutManager.A1a() && i <= linearLayoutManager.A1b()) {
            C9V0 c9v0 = (C9V0) c187318Ry.A0L.A0W(i, false);
            if (c9v0 != null) {
                boolean z = c187318Ry.A0m;
                c9v0.A06 = z;
                c9v0.A0A.setStrokeEnabled(z);
            }
        } else {
            c8se.notifyItemChanged(i);
        }
        interfaceC159417Dc.EdS(i);
    }

    public static final void A06(final C187318Ry c187318Ry, String str, final InterfaceC16820sZ interfaceC16820sZ) {
        View childAt = c187318Ry.A0L.getChildAt(0);
        if (childAt != null) {
            Context context = c187318Ry.A0G;
            C14360o3.A0C(context, AbstractC43591JPw.A00(4));
            C5SU c5su = new C5SU((Activity) context, new C149686oL(str));
            c5su.A06(EnumC58132lV.A02);
            c5su.A03(childAt);
            c5su.A0A = false;
            c5su.A04 = new C33H(c187318Ry) { // from class: X.9oS
                public final /* synthetic */ C187318Ry A00;

                {
                    this.A00 = c187318Ry;
                }

                @Override // X.C33H, X.C33I
                public final void Dtt(C5SW c5sw) {
                    interfaceC16820sZ.invoke();
                    this.A00.A08 = null;
                }
            };
            C5SW A00 = c5su.A00();
            c187318Ry.A08 = A00;
            A00.A07(c187318Ry.A0O);
        }
    }

    private final void A07(C9V0 c9v0, int i) {
        InterfaceC25191BCo aiH;
        boolean z = false;
        if (this.A00 == 5) {
            z = true;
        }
        if (this.A0R.getCount() > 1 || z) {
            if (!this.A0D) {
                aiH = new AiG(this, z);
            } else {
                aiH = new AiH(this, i);
            }
            A01(this);
            C8S3 c8s3 = this.A06;
            View view = c9v0.itemView;
            C14360o3.A06(view);
            c8s3.EkD(view, aiH, i, true);
        }
    }

    private final void A08(boolean z) {
        boolean canHaveEmptySegments = this.A0T.getCanHaveEmptySegments();
        boolean z2 = false;
        int i = 8;
        View view = (View) this.A0V.getValue();
        if (!canHaveEmptySegments && z) {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.A0J;
        if (!z && this.A0C) {
            z2 = true;
        }
        view2.setEnabled(z2);
    }

    public final void A09(int i) {
        C8SE c8se = this.A0S;
        InterfaceC159417Dc interfaceC159417Dc = this.A0R;
        c8se.notifyItemChanged(interfaceC159417Dc.Bsl());
        interfaceC159417Dc.EdS(i);
        c8se.notifyItemChanged(i);
    }

    public final void A0A(boolean z) {
        C55982hj c55982hj = (C55982hj) this.A0Y.getValue();
        if (z) {
            c55982hj.A06(0.0d);
        } else {
            c55982hj.A08(0.0d, true);
        }
    }

    public final void A0C(boolean z, boolean z2) {
        View[] viewArr = {this.A0P};
        if (z) {
            AbstractC125325le.A04(null, viewArr, z2);
        } else {
            AbstractC125325le.A05(viewArr, z2);
        }
    }

    @Override // X.InterfaceC187208Rn
    public final void DNF(C9NH c9nh, int i) {
        if (((View) this.A0V.getValue()).getVisibility() == 0) {
            A08(false);
        }
        C8SE c8se = this.A0S;
        if (c8se.getItemCount() == 1) {
            A0C(true, true);
            c8se.notifyDataSetChanged();
        } else {
            c8se.notifyItemInserted(i);
        }
        A00();
        this.A0B = true;
        this.A0L.postOnAnimation(new RunnableC24432AsD(this));
    }

    @Override // X.InterfaceC187208Rn
    public final void DNc(int i, int i2) {
        C8SE c8se = this.A0S;
        c8se.notifyItemMoved(i, i2);
        int i3 = i;
        if (i > i2) {
            i3 = i2;
        }
        c8se.notifyItemRangeChanged(i3, Math.abs(i - i2) + 1);
        this.A02 = i2;
    }

    @Override // X.InterfaceC187208Rn
    public final void DNm(C9NH c9nh, int i) {
        int Bsl;
        C8SE c8se = this.A0S;
        if (c8se.getItemCount() == 0) {
            if (this.A0T.Ceo()) {
                A08(true);
                c8se.notifyItemRemoved(i);
            } else {
                AbstractC125325le.A05(new View[]{this.A0P}, true);
            }
            c8se.notifyItemRemoved(i);
            return;
        }
        c8se.notifyItemRemoved(i);
        A00();
        RecyclerView recyclerView = this.A0L;
        if (recyclerView.computeHorizontalScrollRange() <= recyclerView.computeHorizontalScrollExtent() || (Bsl = this.A0R.Bsl()) < 0) {
            return;
        }
        recyclerView.A0n(Bsl);
    }

    @Override // X.InterfaceC187208Rn
    public final void DNp(C9NH c9nh, int i) {
        RecyclerView recyclerView = this.A0L;
        if (recyclerView.computeHorizontalScrollRange() > recyclerView.computeHorizontalScrollExtent()) {
            recyclerView.A0n(i);
        }
    }

    public final void A0B(boolean z) {
        A00();
        this.A0J.setEnabled(true);
        IgdsMediaButton igdsMediaButton = this.A07;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(true);
        }
        C55982hj c55982hj = (C55982hj) this.A0Y.getValue();
        if (z) {
            c55982hj.A06(1.0d);
        } else {
            c55982hj.A08(1.0d, true);
        }
        View view = this.A0d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r2 == r3.A0R.Bsl()) goto L16;
     */
    @Override // X.InterfaceC187328Rz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DNs(X.C9V0 r4) {
        /*
            r3 = this;
            int r2 = r4.getLayoutPosition()
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L3e
            r0 = 2
            if (r1 == r0) goto L2c
            r0 = 3
            if (r1 == r0) goto L24
            r0 = 4
            if (r1 != r0) goto L23
            X.7Dc r1 = r3.A0R
            int r0 = r1.Bsl()
            if (r2 != r0) goto L3e
            r0 = -1
            r1.EdS(r0)
            X.8SE r0 = r3.A0S
            r0.notifyItemChanged(r2)
        L23:
            return
        L24:
            X.7Dc r0 = r3.A0R
            int r0 = r0.Bsl()
            if (r2 != r0) goto L3e
        L2c:
            X.8S3 r0 = r3.A06
            boolean r0 = r0.CdI()
            if (r0 == 0) goto L3a
            X.8S3 r0 = r3.A06
            r0.CMI()
            return
        L3a:
            r3.A07(r4, r2)
            return
        L3e:
            A05(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187318Ry.DNs(X.9V0):void");
    }

    @Override // X.InterfaceC187208Rn
    public final void DNz() {
        A00();
        if (this.A0T.Ceo()) {
            A02(this);
        } else {
            this.A0P.post(new Runnable() { // from class: X.80H
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC125325le.A05(new View[]{C187318Ry.this.A0P}, false);
                }
            });
        }
        this.A0S.notifyDataSetChanged();
    }

    public C187318Ry(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C8S0 c8s0, InterfaceC159417Dc interfaceC159417Dc, InterfaceC187288Rv interfaceC187288Rv, C8S1 c8s1, C7VZ c7vz, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, float f, int i, int i2, int i3, int i4, final int i5, final int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        ViewStub viewStub;
        View inflate;
        C81663kb B3U;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(touchInterceptorFrameLayout, 4);
        C14360o3.A0B(interfaceC159417Dc, 5);
        C14360o3.A0B(interfaceC187288Rv, 8);
        this.A0G = context;
        this.A0O = userSession;
        this.A0N = interfaceC11380iw;
        this.A0P = touchInterceptorFrameLayout;
        this.A0R = interfaceC159417Dc;
        this.A0c = i;
        this.A0T = interfaceC187288Rv;
        this.A0g = c8s0;
        this.A0m = z2;
        this.A0a = z3;
        this.A0b = z4;
        this.A0U = c7vz;
        this.A0I = view;
        this.A0k = interfaceC16820sZ;
        this.A0i = c8s1;
        this.A0l = z6;
        this.A0j = interfaceC16820sZ2;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(touchInterceptorFrameLayout.findViewById(R.id.media_thumbnail_tray_text_button_stub), false, false);
        this.A0f = A01;
        View view2 = A01.getView();
        if (view2 == null) {
            view2 = touchInterceptorFrameLayout.requireViewById(R.id.media_thumbnail_tray_button);
            C14360o3.A07(view2);
        }
        this.A0J = view2;
        View findViewById = touchInterceptorFrameLayout.findViewById(R.id.media_thumbnail_tray_save_button);
        this.A0d = findViewById;
        C17050sx A012 = AbstractC09440dt.A01(new C206959Ea(this, 5));
        this.A0W = A012;
        C8S7 c8s7 = new C8S7(interfaceC11380iw, interfaceC159417Dc, (C8S2) A012.getValue(), this, i3);
        this.A0h = c8s7;
        C8SB c8sb = new C8SB(c8s7);
        this.A0K = c8sb;
        C8SE c8se = new C8SE(context, null, c8sb, interfaceC11380iw, userSession, interfaceC159417Dc, this, this, null, null, null, interfaceC16820sZ2, f, i3, i4, i4, z2);
        this.A0S = c8se;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A0e = linearLayoutManager;
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        this.A0M = c70623Ez;
        View requireViewById = touchInterceptorFrameLayout.requireViewById(R.id.media_thumbnail_tray);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.A0S = true;
        recyclerView.setAdapter(c8se);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(c70623Ez);
        recyclerView.setNestedScrollingEnabled(false);
        C14360o3.A07(requireViewById);
        this.A0L = recyclerView;
        this.A0Y = AbstractC09440dt.A01(new C206959Ea(this, 8));
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setPadding(new Rect());
        paintDrawable.setShape(new RectShape());
        this.A0H = paintDrawable;
        this.A0Z = AbstractC13620mo.A02(recyclerView.getContext());
        this.A0X = AbstractC09440dt.A01(new C206959Ea(this, 6));
        this.A0V = AbstractC09440dt.A01(new C206959Ea(this, 4));
        this.A0Q = AbstractC56372iV.A01(touchInterceptorFrameLayout.findViewById(R.id.media_thumbnail_tray_select_destination_switch), false, false);
        this.A0A = C05F.A00;
        this.A0F = (int) C18U.A01(C06090Tz.A05, userSession, 36604498730292302L);
        this.A01 = -1;
        this.A02 = -1;
        this.A06 = (C8S2) this.A0W.getValue();
        this.A0C = true;
        final Resources resources = context.getResources();
        View findViewById2 = touchInterceptorFrameLayout.findViewById(R.id.media_thumbnail_tray_constraintlayout);
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(findViewById2.getContext().getColor(i5));
        }
        if (!C11T.A08()) {
            recyclerView.post(new RunnableC24431AsC(this));
        } else {
            c8sb.A0A(recyclerView);
        }
        this.A06 = (C8S2) this.A0W.getValue();
        AbstractC13880nE.A0W(recyclerView, i3);
        View findViewById3 = touchInterceptorFrameLayout.findViewById(R.id.media_thumbnail_tray_button_shadow);
        this.A04 = findViewById3;
        AbstractC13880nE.A0W(findViewById3, i3);
        this.A00 = i2;
        ((C3F0) c70623Ez).A00 = false;
        recyclerView.A0S = true;
        recyclerView.setAdapter(c8se);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(c70623Ez);
        recyclerView.setNestedScrollingEnabled(false);
        this.A0E = resources.getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
        recyclerView.A10(new AbstractC70653Fc(resources, i6) { // from class: X.8SK
            public final int A00;
            public final int A01;

            @Override // X.AbstractC70653Fc
            public final void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView2, C3F5 c3f5) {
                C14360o3.A0B(rect, 0);
                C14360o3.A0B(view3, 1);
                C14360o3.A0B(recyclerView2, 2);
                int i7 = this.A01 - (this.A00 * 2);
                rect.right = i7;
                if (RecyclerView.A02(view3) == 0) {
                    rect.left = i7;
                }
            }

            {
                this.A00 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                this.A01 = resources.getDimensionPixelSize(i6);
            }
        });
        recyclerView.A14(new C1I4() { // from class: X.8SL
            @Override // X.C1I4
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i7) {
                int A03 = C0f9.A03(275994088);
                if (i7 == 0 || i7 == 1) {
                    C187318Ry.this.A0B = false;
                }
                C0f9.A0A(-315379449, A03);
            }

            @Override // X.C1I4
            public final void onScrolled(RecyclerView recyclerView2, int i7, int i8) {
                int computeHorizontalScrollRange;
                int i9;
                int A03 = C0f9.A03(-1160574191);
                C187318Ry c187318Ry = C187318Ry.this;
                if (c187318Ry.A0B) {
                    i9 = 1828961982;
                } else {
                    boolean z7 = c187318Ry.A0Z;
                    RecyclerView recyclerView3 = c187318Ry.A0L;
                    if (z7) {
                        int computeHorizontalScrollOffset = recyclerView3.computeHorizontalScrollOffset();
                        computeHorizontalScrollRange = 0;
                        if (computeHorizontalScrollOffset > 0) {
                            computeHorizontalScrollRange = -computeHorizontalScrollOffset;
                        }
                    } else {
                        computeHorizontalScrollRange = (recyclerView3.computeHorizontalScrollRange() - recyclerView3.computeHorizontalScrollExtent()) - recyclerView3.computeHorizontalScrollOffset();
                    }
                    c187318Ry.A0H.mutate().setAlpha((int) AbstractC13600mm.A02(Math.abs(computeHorizontalScrollRange), 0.0f, c187318Ry.A0E, 0.0f, 255.0f));
                    i9 = -1146443011;
                }
                C0f9.A0A(i9, A03);
            }
        });
        interfaceC159417Dc.A96(this);
        if (z5) {
            ViewStub viewStub2 = (ViewStub) touchInterceptorFrameLayout.findViewById(R.id.media_gallery_composer_send_stub);
            if (viewStub2 != null) {
                View inflate2 = viewStub2.inflate();
                C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.instagram.igds.components.mediabutton.IgdsMediaButton");
                this.A07 = (IgdsMediaButton) inflate2;
            }
            View findViewById4 = touchInterceptorFrameLayout.findViewById(R.id.media_gallery_composer_layout);
            Drawable drawable = context.getDrawable(AbstractC53242c7.A0H(context, R.attr.messageComposerRedesignBackground));
            C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(-1);
            findViewById4.setBackground(gradientDrawable);
            ViewStub viewStub3 = (ViewStub) touchInterceptorFrameLayout.findViewById(R.id.media_gallery_composer_stub);
            View inflate3 = viewStub3 != null ? viewStub3.inflate() : null;
            C14360o3.A0C(inflate3, "null cannot be cast to non-null type com.instagram.ui.widget.textview.ComposerAutoCompleteTextView");
            ComposerAutoCompleteTextView composerAutoCompleteTextView = (ComposerAutoCompleteTextView) inflate3;
            this.A09 = composerAutoCompleteTextView;
            if (composerAutoCompleteTextView != null) {
                composerAutoCompleteTextView.setTextAppearance(R.style.InGalleryComposerTextArea);
            }
            View view3 = this.A0I;
            if (view3 != null && (viewStub = (ViewStub) view3.findViewById(R.id.media_gallery_composer_command_picker_container)) != null && (inflate = viewStub.inflate()) != null) {
                inflate.bringToFront();
                this.A03 = inflate;
                View findViewById5 = inflate.findViewById(R.id.direct_command_picker_constraint_layout);
                RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.commands_list);
                C14360o3.A0A(findViewById5);
                C14360o3.A0A(recyclerView2);
                InterfaceC11380iw interfaceC11380iw2 = this.A0N;
                C159547Dp c159547Dp = new C159547Dp(inflate, findViewById5, recyclerView2, interfaceC11380iw2);
                Context context2 = this.A0G;
                c159547Dp.A00(context2.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
                if (composerAutoCompleteTextView != null) {
                    composerAutoCompleteTextView.A01(c159547Dp);
                }
                C14360o3.A0C(context2, AbstractC43591JPw.A00(4));
                Activity activity = (Activity) context2;
                UserSession userSession2 = this.A0O;
                C159627Dy c159627Dy = new C159627Dy(interfaceC11380iw2, userSession2);
                B5y b5y = new B5y(this, 39);
                C14360o3.A0B(activity, 0);
                C159637Dz c159637Dz = new C159637Dz(activity, interfaceC11380iw2, userSession2, c159627Dy, c159547Dp, b5y);
                C7VZ c7vz2 = this.A0U;
                if (c7vz2 != null) {
                    AnonymousClass983 anonymousClass983 = c7vz2.A00;
                    if (anonymousClass983.A0b != null && (B3U = C2JD.A00(anonymousClass983.A10).B3U(JRE.A01(anonymousClass983.A0b))) != null) {
                        if (B3U.CVQ()) {
                            c159637Dz.A0C(B3U.BSH(), B3U.A01.A2E);
                        }
                        c159637Dz.A0E.A00(AnonymousClass983.A01(anonymousClass983).A0H(true), B3U, c159637Dz.A0F, false, false);
                    }
                }
                if (composerAutoCompleteTextView != null) {
                    ((IgAutoCompleteTextView) composerAutoCompleteTextView).A02 = 1;
                    composerAutoCompleteTextView.setSupportedLinks(C7OQ.A02);
                    composerAutoCompleteTextView.setAdapter(c159637Dz);
                }
                C7ON c7on = new C7ON(userSession2);
                c7on.A01 = new Aiv(composerAutoCompleteTextView);
                if (composerAutoCompleteTextView != null) {
                    composerAutoCompleteTextView.addTextChangedListener(c7on);
                    composerAutoCompleteTextView.A01 = true;
                }
                Aiu aiu = new Aiu(this, composerAutoCompleteTextView);
                c159547Dp.A02 = aiu;
                L9B l9b = c159547Dp.A01;
                if (l9b != null) {
                    l9b.A01 = aiu;
                }
                if (composerAutoCompleteTextView != null) {
                    composerAutoCompleteTextView.setOnItemClickListener(new C23284ATt(aiu));
                }
            }
            IgdsMediaButton igdsMediaButton = this.A07;
            if (igdsMediaButton != null) {
                C8SM.A00(igdsMediaButton, new B5y(this, 38));
            }
        } else {
            ViewStub viewStub4 = (ViewStub) touchInterceptorFrameLayout.findViewById(R.id.media_thumbnail_tray_send_media_button_stub);
            if (viewStub4 != null) {
                View inflate4 = viewStub4.inflate();
                C14360o3.A0C(inflate4, "null cannot be cast to non-null type com.instagram.igds.components.mediabutton.IgdsMediaButton");
                IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) inflate4;
                this.A07 = igdsMediaButton2;
                if (igdsMediaButton2 != null) {
                    C8SM.A00(igdsMediaButton2, new C206959Ea(this, 3));
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) touchInterceptorFrameLayout.findViewById(R.id.media_thumbnail_tray_constraintlayout);
                C110964z8 c110964z8 = new C110964z8();
                c110964z8.A0I(constraintLayout);
                c110964z8.A0E(R.id.media_thumbnail_tray, 7, R.id.barrier, 6, 0);
                c110964z8.A0G(constraintLayout);
            }
        }
        A03(this);
        C8SM.A00(view2, new C206959Ea(this, 2));
        if (findViewById != null) {
            C3P9 c3p9 = new C3P9(findViewById);
            c3p9.A04 = new C3PD() { // from class: X.8SP
                @Override // X.C3PD, X.C3PE
                public final boolean DsE(View view4) {
                    C187318Ry.this.A0T.Dvh();
                    return true;
                }
            };
            c3p9.A07 = true;
            c3p9.A00();
        }
        if (c8s1 != null) {
            View findViewById6 = view2.findViewById(R.id.media_thumbnail_tray_button_text);
            C14360o3.A07(findViewById6);
            TextView textView = (TextView) findViewById6;
            C14360o3.A0B(textView, 1);
            Context context3 = view2.getContext();
            C14360o3.A0A(context3);
            view2.setBackgroundTintList(C1QI.A0B(context3, null));
            textView.setTextColor(C1QI.A0C(context3, null));
            textView.setCompoundDrawableTintList(C1QI.A0C(context3, null));
        }
        paintDrawable.setPadding(new Rect());
        paintDrawable.setShape(new RectShape());
        touchInterceptorFrameLayout.A00(new View.OnTouchListener() { // from class: X.8SQ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getActionMasked() == 0) {
                    C187318Ry.this.A0P.requestDisallowInterceptTouchEvent(true);
                    return false;
                }
                return false;
            }
        }, new View.OnTouchListener() { // from class: X.8SR
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getActionMasked() == 0) {
                    C187318Ry.this.A0P.requestDisallowInterceptTouchEvent(true);
                }
                return true;
            }
        });
        Runnable runnable = new Runnable() { // from class: X.8SS
            @Override // java.lang.Runnable
            public final void run() {
                C187318Ry c187318Ry = C187318Ry.this;
                C187318Ry.A04(c187318Ry, i5);
                C187318Ry.A02(c187318Ry);
                c187318Ry.A0L.A0n(c187318Ry.A0R.Bsl());
            }
        };
        if (view2.isLaidOut()) {
            runnable.run();
        } else {
            AbstractC13880nE.A0r(view2, runnable);
        }
        if (z) {
            view2.setVisibility(8);
            this.A04.setVisibility(8);
            recyclerView.getLayoutParams().width = -1;
        }
        if (z4) {
            IgdsMediaButton igdsMediaButton3 = this.A07;
            if (igdsMediaButton3 != null) {
                this.A0J.setVisibility(8);
                igdsMediaButton3.setVisibility(0);
                igdsMediaButton3.setContentDescription(igdsMediaButton3.getContext().getString(2131960425));
                this.A04.setVisibility(8);
            }
            A04(this, i5);
        }
    }
}

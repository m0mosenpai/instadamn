package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.FullHeightLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.82h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812982h {
    public static int A00;
    public static final SparseArray A01;
    public static final C1812982h A02 = new Object();

    public static final void A01(View view, ViewGroup viewGroup, TargetViewSizeProvider targetViewSizeProvider, InterfaceC1818984z interfaceC1818984z) {
        int i;
        C14360o3.A0B(targetViewSizeProvider, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(interfaceC1818984z, 2);
        C14360o3.A0B(viewGroup, 3);
        View requireViewById = view.requireViewById(R.id.quick_capture_outer_container);
        C14360o3.A07(requireViewById);
        ViewGroup viewGroup2 = (ViewGroup) requireViewById;
        C1812982h c1812982h = A02;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        int i2 = nineSixteenLayoutConfigImpl.A0D;
        int BRK = targetViewSizeProvider.BRK();
        c1812982h.A02(viewGroup2, viewGroup, i2, BRK);
        c1812982h.A02(viewGroup, viewGroup, i2, BRK);
        AbstractC13880nE.A0e(viewGroup2, nineSixteenLayoutConfigImpl.A01);
        AbstractC13880nE.A0V(viewGroup2, nineSixteenLayoutConfigImpl.A00);
        AbstractC13880nE.A0f(viewGroup2, nineSixteenLayoutConfigImpl.A05);
        AbstractC13880nE.A0U(viewGroup2, nineSixteenLayoutConfigImpl.A03);
        interfaceC1818984z.Elu();
        if (nineSixteenLayoutConfigImpl instanceof FullHeightLayoutConfigImpl) {
            i = 0;
        } else {
            i = nineSixteenLayoutConfigImpl.A0C;
        }
        A00 = i;
    }

    public static final void A03(ViewGroup viewGroup, TargetViewSizeProvider targetViewSizeProvider) {
        C14360o3.A0B(viewGroup, 1);
        if (targetViewSizeProvider.CV5()) {
            AbstractC13880nE.A0W(viewGroup, ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0A);
            AbstractC13880nE.A0j(viewGroup, 0, 0);
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                childAt.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.82h, java.lang.Object] */
    static {
        SparseArray sparseArray = new SparseArray();
        A01 = sparseArray;
        sparseArray.append(R.id.camera_stub_constraint_layout, "camera_stub_constraint_layout");
        sparseArray.append(R.id.video_screenshot_view_stub, "video_screenshot_view_stub");
        sparseArray.append(R.id.post_capture_texture_view_container, "post_capture_texture_view_container");
        sparseArray.append(R.id.post_capture_interactive_contents_container, "post_capture_interactive_contents_container");
        sparseArray.append(R.id.nine_sixteen_video_scrubber_stub, "nine_sixteen_video_scrubber_stub");
        sparseArray.append(R.id.pre_capture_interactive_drawable_container_holder, "pre_capture_interactive_drawable_container_holder");
        sparseArray.append(R.id.capture_interactive_drawable_container, "capture_interactive_drawable_container");
        sparseArray.append(R.id.drawing_view_stub, "drawing_view_stub");
        sparseArray.append(R.id.post_capture_interactive_drawable_container_holder, "post_capture_interactive_drawable_container_holder");
        sparseArray.append(R.id.transparent_color_overlay, "transparent_color_overlay");
        sparseArray.append(R.id.transparent_color_overlay_textureview_stub, "transparent_color_overlay_textureview_stub");
        sparseArray.append(R.id.camera_cover, "camera_cover");
        sparseArray.append(R.id.gallery_loading_preview_cover, "gallery_loading_preview_cover");
        sparseArray.append(R.id.layout_format_divider_container, "layout_format_divider_container");
        sparseArray.append(R.id.layout_format_capture_recycler_stub, "layout_format_capture_recycler_stub");
        sparseArray.append(R.id.layout_format_capture_container_stub, "layout_format_capture_container_stub");
        sparseArray.append(R.id.layout_post_capture_recycler_stub, "layout_post_capture_recycler_stub");
        sparseArray.append(R.id.camera_preview_touch_event_forwarding_view, "camera_preview_touch_event_forwarding_view");
        sparseArray.append(R.id.gl_frame_preview_container, "gl_frame_preview_container");
        sparseArray.append(R.id.layout_camera_preview_animation_stub, "layout_camera_preview_animation_stub");
        sparseArray.append(R.id.selfie_flash_overlay, "selfie_flash_overlay");
        sparseArray.append(R.id.clips_video_remix_camera_background, "clips_video_remix_camera_background");
        sparseArray.append(R.id.gltf_scene_layout_stub, "gltf_scene_layout_stub");
        sparseArray.append(R.id.immersive_photo_controls_stub, "immersive_photo_controls_stub");
    }

    private final void A02(ViewGroup viewGroup, ViewGroup viewGroup2, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            int id = childAt.getId();
            if (A01.indexOfKey(id) < 0 && id != R.id.quick_capture_nav_bar_shadow_overlay && id != R.id.quick_capture_translucent_nav_bar_background && id != R.id.quick_capture_top_shadow_overlay && id != R.id.camera_preview_overlay && id != R.id.clips_pre_capture_container_stub && id != R.id.clips_top_level_container && id != R.id.pre_capture_interactive_contents_container && id != R.id.active_canvas_element_view_stub && id != R.id.layout_camera_tool_menu_container && id != R.id.igtv_camera_pre_capture_container_stub && id != viewGroup2.getId()) {
                if (id != R.id.quick_capture_drawer_content && id != R.id.pre_capture_controls_container && id != R.id.pre_capture_controls_content_container) {
                    if (id == R.id.text_overlay_edit_text_container) {
                        AbstractC13880nE.A0d(childAt, i);
                        AbstractC13880nE.A0Y(childAt, i2);
                    } else {
                        if (id != R.id.quick_capture_bottom_shadow_overlay) {
                            if (id == R.id.gallery_background) {
                                AbstractC13880nE.A0f(childAt, i);
                                childAt = childAt.requireViewById(R.id.gallery_media_thumbnail_tray);
                                C14360o3.A07(childAt);
                            } else {
                                AbstractC13880nE.A0f(childAt, i);
                            }
                        }
                        AbstractC13880nE.A0U(childAt, i2);
                    }
                } else {
                    A02((ViewGroup) childAt, viewGroup2, i, i2);
                }
            }
        }
    }

    public static final void A00(View view, int i, View view2) {
        int height = view2.getHeight();
        if (i >= height) {
            int i2 = i - height;
            AbstractC13880nE.A0d(view, i2 / 2);
            int i3 = i2 / 4;
            AbstractC13880nE.A0d(view2, i3);
            AbstractC13880nE.A0Y(view, i3);
            return;
        }
        float f = i / 2.0f;
        AbstractC13880nE.A0d(view, (int) f);
        AbstractC13880nE.A0Y(view, (int) (f + 0.5f));
        view2.requestLayout();
    }
}

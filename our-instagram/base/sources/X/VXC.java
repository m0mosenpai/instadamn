package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VXC {
    public static final void A00(AnonymousClass182 anonymousClass182, C66630UPs c66630UPs) {
        anonymousClass182.A0d();
        String str = c66630UPs.A09;
        if (str != null) {
            anonymousClass182.A0S("tag", str);
        }
        VDP vdp = c66630UPs.A07;
        C14360o3.A0B(vdp, 0);
        anonymousClass182.A0S(CacheBehaviorLogger.SOURCE, vdp.A00);
        anonymousClass182.A0T("bounce_in", c66630UPs.A0B);
        anonymousClass182.A0T("fade_in", c66630UPs.A0J);
        anonymousClass182.A0T("touch_enabled_by_default", c66630UPs.A0N);
        anonymousClass182.A0T("removable_by_trash_can", c66630UPs.A0M);
        anonymousClass182.A0T("fully_visible_on_screen", c66630UPs.A0L);
        anonymousClass182.A0T("fully_visible_on_alignment_guide", c66630UPs.A0K);
        anonymousClass182.A0T("contour_path_enabled", c66630UPs.A0C);
        anonymousClass182.A0P("min_scale_factor", c66630UPs.A01);
        anonymousClass182.A0P("max_scale_factor", c66630UPs.A00);
        List list = c66630UPs.A0A;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "starting_offset", list);
            while (A0q.hasNext()) {
                anonymousClass182.A0g(((Number) A0q.next()).floatValue());
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0P("starting_scale_factor", c66630UPs.A04);
        anonymousClass182.A0P("starting_normalized_width", c66630UPs.A02);
        anonymousClass182.A0P("starting_rotation", c66630UPs.A03);
        anonymousClass182.A0Q("starting_layer", c66630UPs.A05);
        anonymousClass182.A0T("enable_rotate_gesture", c66630UPs.A0G);
        anonymousClass182.A0T("enable_scale_gesture", c66630UPs.A0H);
        anonymousClass182.A0T("enable_horizontal_translation", c66630UPs.A0F);
        anonymousClass182.A0T("enable_vertical_translation", c66630UPs.A0I);
        anonymousClass182.A0T("enable_bouncy_press_down", c66630UPs.A0D);
        String str2 = c66630UPs.A08;
        if (str2 != null) {
            anonymousClass182.A0S("content_description", str2);
        }
        UPR upr = c66630UPs.A06;
        if (upr != null) {
            anonymousClass182.A0r("bounds_spec");
            anonymousClass182.A0d();
            EnumC68149VDt enumC68149VDt = upr.A08;
            if (enumC68149VDt != null) {
                anonymousClass182.A0Q("bounds_spec_type", enumC68149VDt.A00);
            }
            anonymousClass182.A0P("bias_x", upr.A00);
            anonymousClass182.A0P("bias_y", upr.A01);
            anonymousClass182.A0P("normalized_center_x", upr.A04);
            anonymousClass182.A0P("normalized_center_y", upr.A05);
            anonymousClass182.A0Q("gravity", upr.A06);
            anonymousClass182.A0P("gravity_offset_x", upr.A02);
            anonymousClass182.A0P("gravity_offset_y", upr.A03);
            UQ7 uq7 = upr.A07;
            if (uq7 != null) {
                anonymousClass182.A0r("rect");
                anonymousClass182.A0d();
                anonymousClass182.A0Q("left", uq7.A01);
                anonymousClass182.A0Q("top", uq7.A03);
                anonymousClass182.A0Q("right", uq7.A02);
                anonymousClass182.A0Q("bottom", uq7.A00);
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("enable_bulk_remove_drawables_by_tag", c66630UPs.A0E);
        anonymousClass182.A0T("unlink_drawable_when_removed", c66630UPs.A0O);
        anonymousClass182.A0a();
    }
}

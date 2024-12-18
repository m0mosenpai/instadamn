package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115805Lu extends AbstractC115815Lv {
    public final Object A00;
    public final String A01;
    public final View A02;

    public C115805Lu(View view, EnumC77673dr enumC77673dr, Object obj, String str) {
        super(view, enumC77673dr);
        boolean z;
        Object tag;
        this.A02 = view;
        this.A01 = str;
        this.A00 = obj;
        Map map = super.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component_type", "image");
        if (view instanceof IgImageView) {
            IgImageView igImageView = (IgImageView) view;
            ImageUrl imageUrl = igImageView.A0C;
            if (imageUrl != null) {
                String url = imageUrl.getUrl();
                C14360o3.A07(url);
                linkedHashMap.put("media_urls", AnonymousClass001.A0E(url, '[', ']'));
            }
            linkedHashMap.put("has_fully_rendered", Boolean.valueOf(igImageView.A0N));
            linkedHashMap.put("view_rendering_component_type", "NATIVE");
        }
        if ((view instanceof ImageView) && view.getTag(R.id.image_component_uri_tag) != null && (tag = view.getTag(R.id.image_component_uri_tag)) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(tag);
            sb.append(']');
            linkedHashMap.put("media_urls", sb.toString());
        }
        Integer A06 = C115775Lq.A00.A06(this.A01);
        if (A06 != null) {
            linkedHashMap.put("index_of_card", A06);
            Object obj2 = this.A00;
            if (obj2 instanceof C38321qM) {
                C38321qM c38321qM = (C38321qM) obj2;
                int intValue = A06.intValue();
                C38321qM A1e = c38321qM.A1e(intValue);
                String id = (A1e == null ? c38321qM : A1e).getId();
                if (id != null) {
                    linkedHashMap.put("carousel_media_id", id);
                    C38321qM A1e2 = c38321qM.A1e(intValue);
                    linkedHashMap.put("carousel_media_type", (A1e2 == null ? c38321qM : A1e2).BRp().name());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        map.putAll(linkedHashMap);
        if (view instanceof C115795Ls) {
            C115795Ls c115795Ls = (C115795Ls) view;
            C14360o3.A0A(c115795Ls.getContext());
            map.put("x_pos", Double.valueOf(AbstractC13880nE.A01(r6, c115795Ls.A00)));
            map.put("y_pos", Double.valueOf(AbstractC13880nE.A01(r6, c115795Ls.A01)));
            map.put(IgReactMediaPickerNativeModule.WIDTH, Double.valueOf(AbstractC13880nE.A01(r6, c115795Ls.A03)));
            map.put(IgReactMediaPickerNativeModule.HEIGHT, Double.valueOf(AbstractC13880nE.A01(r6, c115795Ls.A02)));
            map.put("media_urls", AnonymousClass001.A0E(c115795Ls.A05, '[', ']'));
            Drawable drawable = c115795Ls.A04;
            if (drawable == null) {
                z = false;
            } else if (drawable instanceof C89533yt) {
                z = ((C89533yt) drawable).A00;
            } else {
                z = true;
            }
            map.put("has_fully_rendered", Boolean.valueOf(z));
        }
    }
}

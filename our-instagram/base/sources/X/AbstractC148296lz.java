package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC148296lz {
    public static final C148276lx A04(Bitmap bitmap, EnumC150226pU enumC150226pU, String str, String str2, float f) {
        C14360o3.A0B(str2, 1);
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0o.add(bitmap);
        c148286ly.A01 = bitmap.getWidth();
        c148286ly.A00 = bitmap.getHeight();
        c148286ly.A02 = f;
        c148286ly.A0S = str2;
        C148276lx c148276lx = C148276lx.A0a;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        return new C148276lx(enumC150226pU, str, singletonList);
    }

    public static final C148276lx A05(C148286ly c148286ly, String str) {
        C14360o3.A0B(str, 0);
        C148276lx c148276lx = C148276lx.A0a;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        return new C148276lx(EnumC150226pU.A0f, str, singletonList);
    }

    public static final C148276lx A00() {
        ArrayList arrayList = new ArrayList();
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = "gallery_image_sticker_rounded_corners";
        arrayList.add(c148286ly);
        C148286ly c148286ly2 = new C148286ly();
        c148286ly2.A0S = "gallery_image_sticker_normal_corners";
        arrayList.add(c148286ly2);
        C148286ly c148286ly3 = new C148286ly();
        c148286ly3.A0S = "gallery_image_sticker_circle";
        arrayList.add(c148286ly3);
        C148286ly c148286ly4 = new C148286ly();
        c148286ly4.A0S = "gallery_image_sticker_square";
        arrayList.add(c148286ly4);
        C148286ly c148286ly5 = new C148286ly();
        c148286ly5.A0S = "gallery_image_sticker_heart";
        arrayList.add(c148286ly5);
        C148286ly c148286ly6 = new C148286ly();
        c148286ly6.A0S = "gallery_image_sticker_star";
        arrayList.add(c148286ly6);
        return new C148276lx(EnumC150226pU.A0c, "gallery_image_sticker_rounded_corners", arrayList);
    }

    public static final C148276lx A01() {
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = "standalone_fundraiser_sticker_id";
        C148286ly c148286ly2 = new C148286ly();
        c148286ly2.A0S = "multiple_avatar_standalone_sticker_id";
        return new C148276lx(EnumC150226pU.A0F, "standalone_fundraiser_sticker_id", AbstractC16960so.A1Q(c148286ly, c148286ly2));
    }

    public static final C148276lx A02(Bitmap bitmap, double d, double d2, double d3) {
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0o.add(bitmap);
        c148286ly.A01 = (float) d;
        c148286ly.A00 = (float) d2;
        c148286ly.A02 = (float) d3;
        c148286ly.A0S = "gallery_image_sticker_normal_corners";
        C148276lx c148276lx = C148276lx.A0a;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        return new C148276lx(EnumC150226pU.A0c, "gallery_image_sticker_normal_corners", singletonList);
    }

    public static final C148276lx A03(Bitmap bitmap, EnumC150226pU enumC150226pU, String str, float f) {
        C14360o3.A0B(str, 1);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = str;
        c148286ly.A0U = "cutout_photo";
        c148286ly.A0o.add(bitmap);
        c148286ly.A01 = width;
        c148286ly.A00 = height;
        c148286ly.A02 = f;
        c148286ly.A09 = 0;
        C148276lx c148276lx = C148276lx.A0a;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        return new C148276lx(enumC150226pU, "cut_out_sticker_content_id", singletonList);
    }

    public static final C148276lx A06(EnumC150226pU enumC150226pU, String str) {
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = str;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        return new C148276lx(enumC150226pU, str, singletonList);
    }

    public static final C148276lx A07(EnumC150226pU enumC150226pU, String str, String str2) {
        C148286ly c148286ly = new C148286ly();
        c148286ly.A0S = str2;
        C148276lx c148276lx = C148276lx.A0a;
        List singletonList = Collections.singletonList(c148286ly);
        C14360o3.A07(singletonList);
        return new C148276lx(enumC150226pU, str, singletonList);
    }
}

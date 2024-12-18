package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.OZb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55034OZb {
    public N3C A00;
    public Boolean A01;
    public String A02;

    public static final void A00(Activity activity, Intent intent, AbstractC12990ll abstractC12990ll, C55034OZb c55034OZb) {
        String str;
        String str2;
        C006802i c006802i = C006802i.A0p;
        if (c55034OZb.A02 != null && c55034OZb.A01 != null) {
            if (c006802i.isMarkerOn(18951415)) {
                c006802i.markerEnd(18951415, (short) 2);
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("interactive_asset_uri");
            String A00 = AbstractC111324zv.A00(114);
            String stringExtra = intent.getStringExtra(A00);
            Bundle A0b = AbstractC166987dD.A0b();
            String str3 = c55034OZb.A02;
            String str4 = null;
            if (str3 == null) {
                C14360o3.A0F("backgroundFilePath");
                throw C00O.createAndThrow();
            }
            A0b.putString("bg_file_path", str3);
            A0b.putParcelable("interactive_asset_uri", parcelableExtra);
            A0b.putString(A00, stringExtra);
            A0b.putInt("is_linked_fundraiser", AbstractC31177DnL.A1b(c55034OZb.A01) ? 1 : 0);
            N3C n3c = c55034OZb.A00;
            if (n3c != null) {
                str = n3c.A00;
            } else {
                str = null;
            }
            A0b.putString("charity_pfp", str);
            N3C n3c2 = c55034OZb.A00;
            if (n3c2 != null) {
                str2 = n3c2.A02;
            } else {
                str2 = null;
            }
            A0b.putString("sticker_title", str2);
            N3C n3c3 = c55034OZb.A00;
            if (n3c3 != null) {
                str4 = n3c3.A01;
            }
            A0b.putString("sticker_subtitle", str4);
            C6XJ.A02(activity, A0b, abstractC12990ll, TransparentModalActivity.class, AbstractC111324zv.A00(2967)).A0C(activity);
            return;
        }
        C14360o3.A07(c006802i);
        A01(c006802i, "not_initialized_background_file_path_nor_user_is_eligible_for_linked_fundraiser");
    }

    public static final void A01(C006802i c006802i, String str) {
        if (c006802i.isMarkerOn(18951415)) {
            MSY.A1D(c006802i, TraceFieldType.FailureReason, str, 18951415);
        }
    }
}

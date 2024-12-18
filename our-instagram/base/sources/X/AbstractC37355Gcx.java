package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ClipsMashupType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gcx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37355Gcx {
    public static Map A00(InterfaceC84163p3 interfaceC84163p3) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC84163p3.getCanToggleMashupsAllowed();
        A1I.put("can_toggle_mashups_allowed", Boolean.valueOf(interfaceC84163p3.getCanToggleMashupsAllowed()));
        if (interfaceC84163p3.B8F() != null) {
            A1I.put("formatted_mashups_count", interfaceC84163p3.B8F());
        }
        interfaceC84163p3.getHasBeenMashedUp();
        A1I.put("has_been_mashed_up", Boolean.valueOf(interfaceC84163p3.getHasBeenMashedUp()));
        if (interfaceC84163p3.BCG() != null) {
            A1I.put("has_nonmimicable_additional_audio", interfaceC84163p3.BCG());
        }
        interfaceC84163p3.isCreatorRequestingMashup();
        A1I.put("is_creator_requesting_mashup", Boolean.valueOf(interfaceC84163p3.isCreatorRequestingMashup()));
        if (interfaceC84163p3.CXM() != null) {
            A1I.put("is_light_weight_check", interfaceC84163p3.CXM());
        }
        if (interfaceC84163p3.CXN() != null) {
            A1I.put("is_light_weight_reuse_allowed_check", interfaceC84163p3.CXN());
        }
        interfaceC84163p3.isPivotPageAvailable();
        A1I.put("is_pivot_page_available", Boolean.valueOf(interfaceC84163p3.isPivotPageAvailable()));
        if (interfaceC84163p3.Cc6() != null) {
            A1I.put("is_reuse_allowed", interfaceC84163p3.Cc6());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC84163p3.BPi() != null) {
            ClipsMashupType BPi = interfaceC84163p3.BPi();
            if (BPi != null) {
                str = BPi.A00;
            } else {
                str = null;
            }
            A1I.put("mashup_type", str);
        }
        interfaceC84163p3.getMashupsAllowed();
        A1I.put("mashups_allowed", Boolean.valueOf(interfaceC84163p3.getMashupsAllowed()));
        if (interfaceC84163p3.BXE() != null) {
            A1I.put("non_privacy_filtered_mashups_media_count", interfaceC84163p3.BXE());
        }
        if (interfaceC84163p3.BZr() != null) {
            C4GI BZr = interfaceC84163p3.BZr();
            if (BZr != null) {
                treeUpdaterJNI = BZr.F7o();
            }
            A1I.put("original_media", treeUpdaterJNI);
        }
        if (interfaceC84163p3.Bgd() != null) {
            A1I.put("privacy_filtered_mashups_media_count", interfaceC84163p3.Bgd());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}

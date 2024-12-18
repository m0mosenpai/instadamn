package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ACRType;
import com.instagram.model.reels.ReelType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I2T {
    public static Map A00(InterfaceC37821pL interfaceC37821pL) {
        String str;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC37821pL.AYG() != null) {
            ACRType AYG = interfaceC37821pL.AYG();
            if (AYG != null) {
                str2 = AYG.A00;
            } else {
                str2 = null;
            }
            A1I.put("acr_collection_type", str2);
        }
        if (interfaceC37821pL.AYJ() != null) {
            A1I.put("acr_metadata_id", interfaceC37821pL.AYJ());
        }
        if (interfaceC37821pL.AYe() != null) {
            A1I.put("action_text", interfaceC37821pL.AYe());
        }
        if (interfaceC37821pL.getAudioClusterId() != null) {
            A1I.put("audio_cluster_id", interfaceC37821pL.getAudioClusterId());
        }
        if (interfaceC37821pL.Aqt() != null) {
            A1I.put("content_body_text", interfaceC37821pL.Aqt());
        }
        if (interfaceC37821pL.Ar0() != null) {
            A1I.put("content_header_text", interfaceC37821pL.Ar0());
        }
        if (interfaceC37821pL.BF7() != null) {
            AbstractC37300Gc1.A12(interfaceC37821pL.BF7(), A1I);
        }
        C38321qM Bft = interfaceC37821pL.Bft();
        if (Bft != null) {
            A1I.put("preview_media", Bft.A1D());
        }
        if (interfaceC37821pL.Bly() != null) {
            A1I.put("reels_collection_id", interfaceC37821pL.Bly());
        }
        if (interfaceC37821pL.Blz() != null) {
            ReelType Blz = interfaceC37821pL.Blz();
            if (Blz != null) {
                str = Blz.A00;
            } else {
                str = null;
            }
            A1I.put("reels_collection_type", str);
        }
        List Byl = interfaceC37821pL.Byl();
        if (Byl != null) {
            ArrayList A0q = AbstractC167017dG.A0q(Byl);
            Iterator it = Byl.iterator();
            while (it.hasNext()) {
                AbstractC37303Gc4.A1S(A0q, it);
            }
            A1I.put("source_media_list", A0q);
        }
        if (interfaceC37821pL.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC37821pL.getTitle(), A1I);
        }
        if (interfaceC37821pL.CAG() != null) {
            InterfaceC43521JKh CAG = interfaceC37821pL.CAG();
            if (CAG != null) {
                treeUpdaterJNI = CAG.F7o();
            }
            A1I.put("track_schema", treeUpdaterJNI);
        }
        if (interfaceC37821pL.CAR() != null) {
            A1I.put("tracking_token", interfaceC37821pL.CAR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}

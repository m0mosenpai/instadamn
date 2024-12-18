package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.feed.media.CameraToolInfoIntf;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gcy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37356Gcy {
    public static Map A00(CreativeConfigIntf creativeConfigIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI3;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList3 = null;
        if (creativeConfigIntf.AdP() != null) {
            AttributionUser AdP = creativeConfigIntf.AdP();
            if (AdP != null) {
                treeUpdaterJNI3 = AdP.F7o();
            } else {
                treeUpdaterJNI3 = null;
            }
            A1I.put("attribution_user", treeUpdaterJNI3);
        }
        if (creativeConfigIntf.Ak7() != null) {
            A1I.put("camera_tools", creativeConfigIntf.Ak7());
        }
        if (creativeConfigIntf.getCaptureType() != null) {
            A1I.put("capture_type", creativeConfigIntf.getCaptureType());
        }
        if (creativeConfigIntf.Asl() != null) {
            List<CameraToolInfoIntf> Asl = creativeConfigIntf.Asl();
            if (Asl != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (CameraToolInfoIntf cameraToolInfoIntf : Asl) {
                    if (cameraToolInfoIntf != null) {
                        arrayList2.add(cameraToolInfoIntf.F7o());
                    }
                }
            } else {
                arrayList2 = null;
            }
            A1I.put("creation_tool_info", arrayList2);
        }
        if (creativeConfigIntf.AzG() != null) {
            A1I.put("draft_metadata", creativeConfigIntf.AzG());
        }
        if (creativeConfigIntf.AzH() != null) {
            A1I.put("draft_session_id", creativeConfigIntf.AzH());
        }
        if (creativeConfigIntf.B0S() != null) {
            List<EffectPreviewIntf> B0S = creativeConfigIntf.B0S();
            if (B0S != null) {
                arrayList = AbstractC166987dD.A1E();
                for (EffectPreviewIntf effectPreviewIntf : B0S) {
                    if (effectPreviewIntf != null) {
                        arrayList.add(effectPreviewIntf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("effect_configs", arrayList);
        }
        if (creativeConfigIntf.B0a() != null) {
            EffectPreviewIntf B0a = creativeConfigIntf.B0a();
            if (B0a != null) {
                treeUpdaterJNI2 = B0a.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("effect_preview", treeUpdaterJNI2);
        }
        if (creativeConfigIntf.B0b() != null) {
            ProductItemWithARIntf B0b = creativeConfigIntf.B0b();
            if (B0b != null) {
                treeUpdaterJNI = B0b.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC43591JPw.A00(353), treeUpdaterJNI);
        }
        if (creativeConfigIntf.B3R() != null) {
            A1I.put("expressive_format", creativeConfigIntf.B3R());
        }
        if (creativeConfigIntf.B3z() != null) {
            A1I.put("face_effect_id", creativeConfigIntf.B3z());
        }
        if (creativeConfigIntf.getFailureReason() != null) {
            A1I.put(TraceFieldType.FailureReason, creativeConfigIntf.getFailureReason());
        }
        if (creativeConfigIntf.B85() != null) {
            A1I.put("format_variant", creativeConfigIntf.B85());
        }
        if (creativeConfigIntf.B9a() != null) {
            List<GenAIToolInfoDictIntf> B9a = creativeConfigIntf.B9a();
            if (B9a != null) {
                arrayList3 = AbstractC166987dD.A1E();
                for (GenAIToolInfoDictIntf genAIToolInfoDictIntf : B9a) {
                    if (genAIToolInfoDictIntf != null) {
                        arrayList3.add(genAIToolInfoDictIntf.F7o());
                    }
                }
            }
            A1I.put(AbstractC111324zv.A00(960), arrayList3);
        }
        if (creativeConfigIntf.BcZ() != null) {
            A1I.put("persisted_effect_metadata_json", creativeConfigIntf.BcZ());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}

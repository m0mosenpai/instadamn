package X;

import java.util.Collections;
import java.util.List;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8E4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8E4 {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ C8E4[] A05;
    public static final C8E4 A06;
    public static final C8E4 A07;
    public static final C8E4 A08;
    public static final C8E4 A09;
    public static final C8E4 A0A;
    public static final C8E4 A0B;
    public static final C8E4 A0C;
    public static final C8E4 A0D;
    public static final C8E4 A0E;
    public static final C8E4 A0F;
    public static final C8E4 A0G;
    public static final C8E4 A0H;
    public static final C8E4 A0I;
    public final List A00;
    public final long A01;
    public final String A02;
    public final String A03;

    static {
        C16930sl c16930sl = C16930sl.A00;
        A0F = new C8E4("RETINA_FACE_FACIAL_LANDMARKS", "RetinaFace_E2E_FbNetV2_Facial_Landmarks_Detection", "fan_e2e_fbnetv2_100", c16930sl, 0, 2L);
        A0E = new C8E4("RETINA_FACE", "RetinaFace_E2E_Face_Detection", "retinaface_e2e_face_detection", c16930sl, 1, 1L);
        A0H = new C8E4("SCENE_UNDERSTANDING", "SceneUnderstanding", "PYTORCH_MODEL", AbstractC16960so.A1Q("xray_vocab.json", "concept_vocab.json"), 2, 10020L);
        A0G = new C8E4("SCENEX_EXECUTORCH", "SceneUnderstanding", "PYTORCH_MODEL", AbstractC16960so.A1Q("xray_vocab.json", "concept_vocab.json"), 3, 50060L);
        A06 = new C8E4("BODY_KP_MODEL", "BodyKPModel", "PYTORCH_MODEL", c16930sl, 4, 1020L);
        A0A = new C8E4("PERSON_SEGMENTATION", "Person_Segmentation", "PYTORCH_MODEL", c16930sl, 5, 1L);
        A0B = new C8E4("PYTORCH_SALIENCY", "Saliency", "PYTORCH_MODEL", c16930sl, 6, 2020L);
        A09 = new C8E4("ET_SEGMENT_ANYTHING_MODEL", "SegmentAnything", "PYTORCH_MODEL", c16930sl, 7, 32030L);
        A0C = new C8E4("PYTORCH_SEGMENT_ANYTHING_MODEL", "SegmentAnything", "PYTORCH_MODEL", c16930sl, 8, 10020L);
        A0D = new C8E4("PYTORCH_U_TWO_NET", "UTwoNet", "PYTORCH_MODEL", c16930sl, 9, 1020L);
        A0I = new C8E4("U_TWO_NET", "UTWONET", "ET_MODEL", c16930sl, 10, 1L);
        List singletonList = Collections.singletonList("llama2_tokenizer");
        C14360o3.A07(singletonList);
        A07 = new C8E4("COLOR_LM", "ColorLM", "PYTORCH_MODEL", singletonList, 11, 1L);
        List singletonList2 = Collections.singletonList("llama2_tokenizer");
        C14360o3.A07(singletonList2);
        C8E4 c8e4 = new C8E4("COLOR_LM_ET", "ColorLM", "EXECUTORCH", singletonList2, 12, 2L);
        A08 = c8e4;
        C8E4[] c8e4Arr = {A0F, A0E, A0H, A0G, A06, A0A, A0B, A09, A0C, A0D, A0I, A07, c8e4};
        A05 = c8e4Arr;
        A04 = AbstractC12190kN.A00(c8e4Arr);
    }

    public static C8E4 valueOf(String str) {
        return (C8E4) Enum.valueOf(C8E4.class, str);
    }

    public static C8E4[] values() {
        return (C8E4[]) A05.clone();
    }

    public final C8E5 A00() {
        return new C8E5(this.A03, this.A02, this.A00, this.A01);
    }

    public C8E4(String str, String str2, String str3, List list, int i, long j) {
        this.A03 = str2;
        this.A01 = j;
        this.A02 = str3;
        this.A00 = list;
    }
}

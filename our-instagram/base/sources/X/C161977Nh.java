package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.7Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161977Nh {
    public final C7UB A00;

    public static final C25994Bei A00(C67146UhG c67146UhG) {
        String A07 = c67146UhG.A07("video_id");
        String A0A = c67146UhG.A0A("sd_progressive_url");
        String A09 = c67146UhG.A09("hd_progressive_url");
        if (A07 != null && A0A != null && A09 != null) {
            return new C25994Bei(c67146UhG.getCoercedIntField(4, "duration_ms"), A07, A0A, A09, c67146UhG.A08(AbstractC43591JPw.A00(75)), c67146UhG.getCoercedIntField(5, "expiry"));
        }
        return null;
    }

    public static final C51753Mtc A01(C67125Ugv c67125Ugv) {
        int i;
        int i2;
        int i3;
        VFG vfg = (VFG) c67125Ugv.getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, VFG.A02);
        if (vfg != null) {
            i = vfg.ordinal();
        } else {
            i = -1;
        }
        ImmutableList requiredCompactedTreeListField = c67125Ugv.getRequiredCompactedTreeListField(1, "intensities", C67124Ugu.class, 269461125);
        C14360o3.A07(requiredCompactedTreeListField);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<E> it = requiredCompactedTreeListField.iterator();
        while (it.hasNext()) {
            C2JS c2js = (C2JS) it.next();
            EnumC223149st enumC223149st = EnumC223149st.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            EnumC223149st enumC223149st2 = (EnumC223149st) c2js.getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, enumC223149st);
            if (enumC223149st2 != null) {
                i2 = enumC223149st2.ordinal();
            } else {
                i2 = -1;
            }
            Integer valueOf = Integer.valueOf(i2);
            EnumC223149st enumC223149st3 = (EnumC223149st) c2js.getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, enumC223149st);
            if (enumC223149st3 != null) {
                i3 = enumC223149st3.ordinal();
            } else {
                i3 = -1;
            }
            ImmutableList requiredCompactedTreeListField2 = c2js.getRequiredCompactedTreeListField(1, "videos", QoP.class, 1216364187);
            C14360o3.A07(requiredCompactedTreeListField2);
            ArrayList arrayList = new ArrayList();
            Iterator<E> it2 = requiredCompactedTreeListField2.iterator();
            while (it2.hasNext()) {
                C67146UhG c67146UhG = (C67146UhG) ((C2JS) it2.next()).reinterpretRequired(0, C67146UhG.class, -1940125461);
                C14360o3.A07(c67146UhG);
                C25994Bei A00 = A00(c67146UhG);
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
            linkedHashMap.put(valueOf, new C51752Mtb((List) AbstractC001800i.A0U(arrayList), i3, 0, 0));
        }
        return new C51753Mtc(linkedHashMap, i, 0);
    }

    public C161977Nh(C7UB c7ub) {
        this.A00 = c7ub;
    }
}

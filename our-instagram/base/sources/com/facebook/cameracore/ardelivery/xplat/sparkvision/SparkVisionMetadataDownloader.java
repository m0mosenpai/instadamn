package com.facebook.cameracore.ardelivery.xplat.sparkvision;

import X.AY2;
import X.AbstractC001800i;
import X.AbstractC58317Pt9;
import X.BUV;
import X.BUW;
import X.C05F;
import X.C14360o3;
import X.C1819085a;
import X.C1819185b;
import X.C1Dk;
import X.C1LC;
import X.C209499Oj;
import X.C2JO;
import X.C2JS;
import X.C65075Td4;
import X.EnumC209529On;
import X.InterfaceC40711ue;
import X.InterfaceC48212Jk;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.sparkvision.SparkVisionMetadataResponse;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class SparkVisionMetadataDownloader {
    public final InterfaceC40711ue graphQLQueryExecutor;

    public SparkVisionMetadataDownloader(InterfaceC40711ue interfaceC40711ue) {
        C14360o3.A0B(interfaceC40711ue, 1);
        this.graphQLQueryExecutor = interfaceC40711ue;
    }

    public final void downloadModelMetadata(List list, C1819185b c1819185b, SparkVisionMetadataCallback sparkVisionMetadataCallback) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(sparkVisionMetadataCallback, 2);
        C1Dk makeQuery = makeQuery(makeRequest(list));
        final C65075Td4 c65075Td4 = new C65075Td4(sparkVisionMetadataCallback, 13);
        this.graphQLQueryExecutor.ATV(new InterfaceC48212Jk() { // from class: X.AXV
            @Override // X.InterfaceC48212Jk
            public final /* synthetic */ void invoke(Throwable th) {
                InterfaceC16660sJ.this.invoke(th);
            }
        }, new AY2(sparkVisionMetadataCallback, this, c65075Td4), makeQuery);
    }

    public final void xplatDownloadModelMetadata(List list, SparkVisionMetadataCallback sparkVisionMetadataCallback) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(sparkVisionMetadataCallback, 1);
        downloadModelMetadata(list, new C1819085a().A00(), sparkVisionMetadataCallback);
    }

    private final C1Dk makeQuery(ImmutableList immutableList) {
        C2JO c2jo = new C2JO();
        ImmutableList of = ImmutableList.of((Object) "TAR_BROTLI", (Object) "None");
        c2jo.A05("bytecodeVersion", new ArrayList());
        c2jo.A05("supportedCompressions", of);
        BUW A00 = BUV.A00();
        A00.A00(immutableList);
        A00.A00.A00(c2jo, "client_capability_metadata");
        C1Dk A002 = A00.A00();
        C14360o3.A0A(A002);
        return A002;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.SLV, java.lang.Object] */
    public final SparkVisionMetadataResponse parseResults(ImmutableList immutableList) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1LC it = immutableList.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            C2JS c2js = (C2JS) it.next();
            if (c2js != null) {
                str = c2js.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            } else {
                str = null;
            }
            ImmutableList requiredCompactedTreeListField = c2js.getRequiredCompactedTreeListField(2, "assets", C209499Oj.class, 70526919);
            C14360o3.A07(requiredCompactedTreeListField);
            if (str != null && requiredCompactedTreeListField.size() != 0 && requiredCompactedTreeListField.size() <= 1) {
                C2JS c2js2 = (C2JS) AbstractC001800i.A0I(requiredCompactedTreeListField);
                String A07 = c2js2.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                if (A07 == null) {
                    A07 = "";
                }
                String optionalStringField = c2js2.getOptionalStringField(7, "url");
                String A0B = c2js2.A0B("md5_hash");
                long coercedIntField = c2js2.getCoercedIntField(8, AbstractC58317Pt9.A00(101));
                linkedHashMap.put(str, new XplatRemoteAsset(new ARRequestAsset(ARAssetType.EFFECT, ARRequestAsset.CompressionMethod.fromString(String.valueOf(c2js2.getOptionalEnumField(9, TraceFieldType.CompressionType, EnumC209529On.UNSET_OR_UNRECOGNIZED_ENUM_VALUE))), EffectAssetType.NORMAL_EFFECT, null, null, null, null, C05F.A00, str, A07, null, "", optionalStringField, A0B, c2js2.A0A("source_content_hash"), null, null, null, -1, coercedIntField, 0L, false, false, false)));
            } else {
                ?? obj = new Object();
                obj.A00 = C05F.A08;
                throw obj.A00();
            }
        }
        return new SparkVisionMetadataResponse(linkedHashMap);
    }

    private final ImmutableList makeRequest(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C2JO c2jo = new C2JO();
            c2jo.A09(str, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            builder.add((Object) c2jo);
        }
        ImmutableList build = builder.build();
        C14360o3.A07(build);
        return build;
    }
}

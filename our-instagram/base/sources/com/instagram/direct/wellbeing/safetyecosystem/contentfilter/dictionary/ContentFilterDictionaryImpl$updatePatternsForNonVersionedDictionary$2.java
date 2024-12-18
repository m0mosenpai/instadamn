package com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2", f = "ContentFilterDictionaryImpl.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6}, l = {285, 219, 226, 237, 241, 244, 249}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "mutationsDao", "$this$withLock_u24default$iv", "mutationsDao", "idAndKey", "$this$withLock_u24default$iv", "mutationsDao", "idAndKey", "updatedPatterns", "$this$withLock_u24default$iv", "mutationsDao", "updatedPatterns", PublicKeyCredentialControllerUtility.JSON_KEY_ID, "$this$withLock_u24default$iv", "updatedPatterns", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$4", "L$0", "L$4", "L$5", "L$0", "L$4", "L$5", "L$6", "L$0", "L$4", "L$5", "J$0", "L$0", "L$4", "L$0"})
/* loaded from: classes4.dex */
public final class ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final /* synthetic */ ContentFilterDictionaryImpl A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2(ContentFilterDictionaryImpl contentFilterDictionaryImpl, List list, List list2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A09 = contentFilterDictionaryImpl;
        this.A0A = list;
        this.A0B = list2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2(this.A09, this.A0A, this.A0B, interfaceC23621Ds);
    }

    public static void A00(ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2 contentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2, Object obj, Object obj2, Object obj3, Object obj4) {
        contentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2.A02 = obj;
        contentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2.A03 = obj2;
        contentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2.A04 = obj3;
        contentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2.A05 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #5 {all -> 0x0229, blocks: (B:5:0x01ec, B:7:0x01ef, B:9:0x01f5, B:16:0x020a, B:22:0x00d7, B:25:0x00f6, B:27:0x00ff, B:30:0x010d, B:32:0x0111, B:35:0x012a, B:43:0x015d, B:45:0x0163, B:46:0x0173, B:48:0x0179, B:50:0x0186, B:61:0x01db, B:62:0x01dd, B:65:0x01e4, B:66:0x01e5, B:69:0x0216, B:70:0x0217, B:75:0x021a, B:79:0x0222, B:80:0x0226, B:84:0x01d8, B:64:0x01de), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d A[Catch: all -> 0x0229, TRY_ENTER, TryCatch #5 {all -> 0x0229, blocks: (B:5:0x01ec, B:7:0x01ef, B:9:0x01f5, B:16:0x020a, B:22:0x00d7, B:25:0x00f6, B:27:0x00ff, B:30:0x010d, B:32:0x0111, B:35:0x012a, B:43:0x015d, B:45:0x0163, B:46:0x0173, B:48:0x0179, B:50:0x0186, B:61:0x01db, B:62:0x01dd, B:65:0x01e4, B:66:0x01e5, B:69:0x0216, B:70:0x0217, B:75:0x021a, B:79:0x0222, B:80:0x0226, B:84:0x01d8, B:64:0x01de), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163 A[Catch: all -> 0x0229, TryCatch #5 {all -> 0x0229, blocks: (B:5:0x01ec, B:7:0x01ef, B:9:0x01f5, B:16:0x020a, B:22:0x00d7, B:25:0x00f6, B:27:0x00ff, B:30:0x010d, B:32:0x0111, B:35:0x012a, B:43:0x015d, B:45:0x0163, B:46:0x0173, B:48:0x0179, B:50:0x0186, B:61:0x01db, B:62:0x01dd, B:65:0x01e4, B:66:0x01e5, B:69:0x0216, B:70:0x0217, B:75:0x021a, B:79:0x0222, B:80:0x0226, B:84:0x01d8, B:64:0x01de), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b3 A[Catch: all -> 0x0218, LOOP:2: B:54:0x01ad->B:56:0x01b3, LOOP_END, TryCatch #2 {all -> 0x0218, blocks: (B:53:0x01a5, B:54:0x01ad, B:56:0x01b3, B:58:0x01c0, B:87:0x01a2), top: B:86:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021a A[Catch: all -> 0x0229, TRY_ENTER, TryCatch #5 {all -> 0x0229, blocks: (B:5:0x01ec, B:7:0x01ef, B:9:0x01f5, B:16:0x020a, B:22:0x00d7, B:25:0x00f6, B:27:0x00ff, B:30:0x010d, B:32:0x0111, B:35:0x012a, B:43:0x015d, B:45:0x0163, B:46:0x0173, B:48:0x0179, B:50:0x0186, B:61:0x01db, B:62:0x01dd, B:65:0x01e4, B:66:0x01e5, B:69:0x0216, B:70:0x0217, B:75:0x021a, B:79:0x0222, B:80:0x0226, B:84:0x01d8, B:64:0x01de), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01f5 A[Catch: all -> 0x0229, TryCatch #5 {all -> 0x0229, blocks: (B:5:0x01ec, B:7:0x01ef, B:9:0x01f5, B:16:0x020a, B:22:0x00d7, B:25:0x00f6, B:27:0x00ff, B:30:0x010d, B:32:0x0111, B:35:0x012a, B:43:0x015d, B:45:0x0163, B:46:0x0173, B:48:0x0179, B:50:0x0186, B:61:0x01db, B:62:0x01dd, B:65:0x01e4, B:66:0x01e5, B:69:0x0216, B:70:0x0217, B:75:0x021a, B:79:0x0222, B:80:0x0226, B:84:0x01d8, B:64:0x01de), top: B:2:0x0005, inners: #0 }] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentFilterDictionaryImpl$updatePatternsForNonVersionedDictionary$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}

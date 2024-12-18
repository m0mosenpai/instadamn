package com.instagram.creation.drafts.model.clips;

import X.AbstractC208910l;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C12L;
import X.C14360o3;
import X.C16930sl;
import X.C19L;
import X.C49602Pt;
import X.C9J0;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.creation.drafts.model.datasource.clips.ClipsImportDraftDataSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class ClipsNetworkImportDraftRepository {
    public final Context A00;
    public final UserSession A01;
    public final CameraSpec A02;
    public final ClipsDraftLocalDataSource A03;
    public final ClipsImportDraftDataSource A04;
    public final C49602Pt A05;
    public final C0UO A0A;
    public final C05A A0B;
    public final C19L A09 = AnonymousClass194.A02(C12L.A00.CPG(480314591, 3).plus(new AnonymousClass197(null)));
    public final HashSet A06 = new HashSet();
    public final HashSet A07 = new HashSet();
    public final HashSet A08 = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0e5] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.5Kv] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.5Kv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository r32, X.C5Kv r33, java.lang.String r34, java.lang.String r35, java.util.List r36, X.InterfaceC23621Ds r37, X.InterfaceC16820sZ r38) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository.A00(com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository, X.5Kv, java.lang.String, java.lang.String, java.util.List, X.1Ds, X.0sZ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository r26, X.C5Kv r27, java.lang.String r28, java.util.List r29, X.InterfaceC23621Ds r30, X.InterfaceC16820sZ r31) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository.A01(com.instagram.creation.drafts.model.clips.ClipsNetworkImportDraftRepository, X.5Kv, java.lang.String, java.util.List, X.1Ds, X.0sZ):java.lang.Object");
    }

    public static final void A02(ClipsNetworkImportDraftRepository clipsNetworkImportDraftRepository, String str) {
        clipsNetworkImportDraftRepository.A07.remove(str);
        C05A c05a = clipsNetworkImportDraftRepository.A0B;
        List list = (List) c05a.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!C14360o3.A0K(((C9J0) obj).A09, str)) {
                arrayList.add(obj);
            }
        }
        c05a.Egh(arrayList);
    }

    public ClipsNetworkImportDraftRepository(Context context, UserSession userSession, CameraSpec cameraSpec, ClipsDraftLocalDataSource clipsDraftLocalDataSource, ClipsImportDraftDataSource clipsImportDraftDataSource, C49602Pt c49602Pt) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = clipsImportDraftDataSource;
        this.A03 = clipsDraftLocalDataSource;
        this.A05 = c49602Pt;
        this.A02 = cameraSpec;
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A0B = A00;
        this.A0A = AbstractC208910l.A02(A00);
    }
}

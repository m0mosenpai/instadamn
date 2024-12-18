package com.instagram.contentprovider;

import X.A9J;
import X.AY3;
import X.AbstractC08820cl;
import X.AbstractC102054iQ;
import X.AbstractC111324zv;
import X.AbstractC12960li;
import X.AbstractC40511uK;
import X.AbstractC40691uc;
import X.AbstractC58329PtM;
import X.AnonymousClass001;
import X.C023409i;
import X.C03250Di;
import X.C06090Tz;
import X.C08V;
import X.C09Y;
import X.C0CA;
import X.C0fI;
import X.C12210kP;
import X.C14360o3;
import X.C18920wW;
import X.C1AD;
import X.C23355AXe;
import X.C2JM;
import X.C2JQ;
import X.C40701ud;
import X.InterfaceC02590Ai;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.ppml.enigma.InstallReferrerEventV2;
import com.facebook.secure.content.PublicContentDelegate;
import com.instagram.contentprovider.InstallReferrerProvider;
import com.instagram.contentprovider.graphql.IGMIRContentProviderMutationResponseImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public final class InstallReferrerProvider extends AbstractC58329PtM {

    /* loaded from: classes2.dex */
    public final class Impl extends PublicContentDelegate implements C08V {
        public int A00;
        public long A01;
        public C18920wW A02;
        public Set A03;
        public final C03250Di A04;
        public final Map A05;
        public final UriMatcher A06;

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        
            if ((java.lang.System.currentTimeMillis() - r26.A01) > 50000) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0203  */
        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.net.Uri A0R(android.net.Uri r27, android.content.ContentValues r28) {
            /*
                Method dump skipped, instructions count: 517
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.InstallReferrerProvider.Impl.A0R(android.net.Uri, android.content.ContentValues):android.net.Uri");
        }

        private final InstallReferrerEventV2 A00(InstallReferrerEventV2 installReferrerEventV2, String str, String str2, String str3) {
            String str4;
            Context context = ((AbstractC102054iQ) this).A00.getContext();
            if (context != null && context.getPackageManager() != null && context.getPackageManager().resolveContentProvider(str3, 0) != null) {
                Uri A03 = AbstractC08820cl.A03(AnonymousClass001.A0i("content://", str3, str, '/'));
                C14360o3.A07(A03);
                String[] strArr = {"install_referrer", "is_ct", "actual_timestamp"};
                String str5 = "0";
                if (installReferrerEventV2 == null) {
                    str4 = "0";
                } else {
                    str4 = String.valueOf(installReferrerEventV2.activityType);
                    str5 = String.valueOf(installReferrerEventV2.timestamp);
                }
                Cursor A01 = C0fI.A01(context.getContentResolver(), A03, "is_ct = ? AND actual_timestamp = ? AND package_name = ?", null, strArr, new String[]{str4, str5, str2}, 749387912);
                if (A01 != null) {
                    try {
                        if (A01.moveToFirst()) {
                            int columnIndex = A01.getColumnIndex("install_referrer");
                            int columnIndex2 = A01.getColumnIndex("is_ct");
                            int columnIndex3 = A01.getColumnIndex("actual_timestamp");
                            String string = A01.getString(columnIndex);
                            int i = A01.getInt(columnIndex2);
                            long j = A01.getLong(columnIndex3);
                            if (string != null) {
                                return new InstallReferrerEventV2(str, 1, i, string, j, "");
                            }
                        }
                    } finally {
                        A01.close();
                    }
                }
            }
            return installReferrerEventV2;
        }

        private final void A01(long j, String str, String str2, String str3) {
            String str4 = str3;
            C18920wW c18920wW = this.A02;
            String A00 = AbstractC111324zv.A00(3906);
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, A00);
            if (A002.isSampled()) {
                A002.AAP("action", str);
                A002.AAP("asset_id", str2);
                A002.A9K("activity_type", Long.valueOf(j));
                A002.AAP("error", str4);
                A002.Cht();
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C1AD.A06(c06090Tz, 18304553615694636L)) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", AbstractC111324zv.A00(1661));
                    C09Y c09y = C023409i.A0A;
                    c09y.A03(this);
                    C40701ud A003 = AbstractC40691uc.A00(c09y.A02(bundle));
                    C0CA A02 = GraphQlCallInput.A02.A02();
                    C0CA.A00(A02, str, "action");
                    C0CA.A00(A02, Integer.valueOf((int) j), "activity_type");
                    C0CA.A00(A02, str2, "asset_id");
                    if (str3 == null) {
                        str4 = "";
                    }
                    C0CA.A00(A02, str4, "error");
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    c2jm.A00.A02().A0E(A02, "mir_info");
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGMIRContentProviderMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), IGMIRContentProviderMutationResponseImpl.class, true, null, 0, null, "xig_log_ig_mir_content_provider_info", new ArrayList());
                    if (C1AD.A06(c06090Tz, 18304553615891246L)) {
                        pandoGraphQLRequest.setRetryPolicy(1);
                        pandoGraphQLRequest.setNetworkTimeoutSeconds((int) C1AD.A01(c06090Tz, 18586028592533390L));
                    }
                    A003.ATV(new C23355AXe(this, str2, j), AY3.A00, pandoGraphQLRequest);
                } catch (Exception e) {
                    C18920wW c18920wW2 = this.A02;
                    InterfaceC02590Ai A004 = c18920wW2.A00(c18920wW2.A00, A00);
                    if (A004.isSampled()) {
                        A004.AAP("action", str);
                        A004.AAP("asset_id", str2);
                        A004.A9K("activity_type", Long.valueOf(j));
                        A004.AAP("error", e.getMessage());
                        A004.Cht();
                    }
                }
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:
        
            if (r5.timestamp > r6) goto L55;
         */
        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized android.database.Cursor A0Q(android.net.Uri r29, java.lang.String[] r30, java.lang.String r31, java.lang.String[] r32, java.lang.String r33) {
            /*
                Method dump skipped, instructions count: 624
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.contentprovider.InstallReferrerProvider.Impl.A0Q(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public final void A0U() {
            this.A06.addURI("com.instagram.contentprovider.InstallReferrerProvider", "#", 1);
            this.A02 = new C12210kP(AbstractC12960li.A00).A00();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impl(AbstractC58329PtM abstractC58329PtM) {
            super(abstractC58329PtM);
            C14360o3.A0A(abstractC58329PtM);
            this.A06 = new UriMatcher(-1);
            C03250Di c03250Di = C03250Di.A00;
            C14360o3.A07(c03250Di);
            this.A04 = c03250Di;
            this.A00 = 10;
            this.A05 = new LinkedHashMap<String, A9J>() { // from class: X.4iY
                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ boolean containsKey(Object obj) {
                    if (!(obj instanceof String)) {
                        return false;
                    }
                    return super.containsKey(obj);
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ boolean containsValue(Object obj) {
                    if (!(obj instanceof A9J)) {
                        return false;
                    }
                    return super.containsValue(obj);
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ /* synthetic */ Object get(Object obj) {
                    if (!(obj instanceof String)) {
                        return null;
                    }
                    return super.get(obj);
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
                public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                    if (!(obj instanceof String)) {
                        return obj2;
                    }
                    return super.getOrDefault(obj, obj2);
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                    if (!(obj instanceof String)) {
                        return null;
                    }
                    return super.remove(obj);
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ java.util.Set entrySet() {
                    return super.entrySet();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ java.util.Set keySet() {
                    return super.keySet();
                }

                @Override // java.util.LinkedHashMap
                public final boolean removeEldestEntry(Map.Entry<String, A9J> entry) {
                    if (size() <= InstallReferrerProvider.Impl.this.A00) {
                        return false;
                    }
                    return true;
                }

                @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ int size() {
                    return super.size();
                }

                @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
                public final /* bridge */ Collection values() {
                    return super.values();
                }

                @Override // java.util.HashMap, java.util.Map
                public final /* bridge */ boolean remove(Object obj, Object obj2) {
                    if (!(obj instanceof String) || !(obj2 instanceof A9J)) {
                        return false;
                    }
                    return super.remove(obj, obj2);
                }
            };
        }
    }
}

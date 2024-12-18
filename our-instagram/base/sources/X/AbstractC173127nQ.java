package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7nQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173127nQ {
    public static final C173007nE A00(CameraAREffect cameraAREffect, long j) {
        C14360o3.A0B(cameraAREffect, 0);
        String str = cameraAREffect.A0K;
        C14360o3.A07(str);
        String str2 = cameraAREffect.A0M;
        String str3 = cameraAREffect.A0J;
        if (str3 != null) {
            boolean z = cameraAREffect.A0d;
            boolean z2 = cameraAREffect.A0g;
            boolean z3 = cameraAREffect.A0j;
            boolean A0L = cameraAREffect.A0L();
            String str4 = cameraAREffect.A0G;
            String str5 = cameraAREffect.A0H;
            if (str5 != null) {
                String str6 = cameraAREffect.A0S;
                C14360o3.A07(str6);
                String str7 = cameraAREffect.A0A;
                if (str7 != null) {
                    long j2 = cameraAREffect.A02;
                    long j3 = cameraAREffect.A03;
                    String str8 = cameraAREffect.A0P;
                    ImageUrl imageUrl = cameraAREffect.A07;
                    C14360o3.A07(imageUrl);
                    ImageUrl imageUrl2 = cameraAREffect.A08;
                    List list = cameraAREffect.A0X;
                    C14360o3.A07(list);
                    java.util.Set set = cameraAREffect.A0b;
                    C14360o3.A07(set);
                    boolean z4 = cameraAREffect.A0f;
                    java.util.Set set2 = cameraAREffect.A0a;
                    C14360o3.A07(set2);
                    String A00 = AbstractC120335cZ.A00(cameraAREffect.A09);
                    String str9 = cameraAREffect.A0B;
                    String str10 = cameraAREffect.A0C;
                    ImageUrl imageUrl3 = cameraAREffect.A05;
                    List list2 = cameraAREffect.A0T;
                    C14360o3.A07(list2);
                    List list3 = cameraAREffect.A0V;
                    C14360o3.A0C(list3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    List list4 = cameraAREffect.A0W;
                    C14360o3.A0C(list4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    int i = cameraAREffect.A01;
                    String str11 = cameraAREffect.A0L;
                    ImageUrl imageUrl4 = cameraAREffect.A06;
                    C14360o3.A07(imageUrl4);
                    List list5 = cameraAREffect.A0U;
                    boolean z5 = cameraAREffect.A0i;
                    int i2 = cameraAREffect.A00;
                    boolean z6 = cameraAREffect.A0e;
                    List unmodifiableList = Collections.unmodifiableList(cameraAREffect.A0Y);
                    C14360o3.A07(unmodifiableList);
                    return new C173007nE(imageUrl, imageUrl2, imageUrl3, imageUrl4, str, str2, str3, str4, str5, str6, str7, str8, A00, str9, str10, str11, null, null, null, cameraAREffect.A0N, cameraAREffect.A0O, cameraAREffect.A0D, cameraAREffect.A0R, cameraAREffect.A0F, cameraAREffect.A0E, list, list2, list3, list4, list5, unmodifiableList, set, set2, 0, i, i2, j2, j3, j, z, z2, false, z3, A0L, z4, z5, false, z6);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C172937n7 A01(C191258dU c191258dU, String str, long j, boolean z) {
        C14360o3.A0B(c191258dU, 0);
        String str2 = c191258dU.A02;
        String str3 = c191258dU.A01;
        C14360o3.A0B(str2, 0);
        return new C172937n7(str2, str3, str, AnonymousClass001.A0T(str2, str3, '_'), j, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (r21 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.camera.effect.models.CameraAREffect A02(X.C173007nE r65, java.lang.String r66) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC173127nQ.A02(X.7nE, java.lang.String):com.instagram.camera.effect.models.CameraAREffect");
    }

    public static final C173327nk A03(C173117nP c173117nP) {
        C172937n7 c172937n7 = c173117nP.A00;
        C191268dV c191268dV = C191258dU.A03;
        String str = c172937n7.A04;
        String str2 = c172937n7.A02;
        C85A c85a = (C85A) EnumHelper.A00(str, C85A.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(c85a);
        C191258dU A01 = c191268dV.A01(c85a, str2);
        List list = c173117nP.A01;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A02((C173007nE) it.next(), str2));
        }
        return new C173327nk(new C206269Bj(A01, C05F.A0C, Long.valueOf(c172937n7.A00), arrayList), c172937n7.A03, c172937n7.A05);
    }
}

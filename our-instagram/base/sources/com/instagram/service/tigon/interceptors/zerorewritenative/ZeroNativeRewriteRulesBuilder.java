package com.instagram.service.tigon.interceptors.zerorewritenative;

import X.C09170dP;
import X.C14360o3;
import X.C1AP;
import X.C26691Qy;
import X.C72643XjW;
import com.facebook.common.dextricks.Constants;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ZeroNativeRewriteRulesBuilder {
    public static final C72643XjW Companion = new Object();
    public HybridData mHybridData;
    public final C1AP flatBufferBuilder = new C1AP(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
    public int ruleVector = -1;

    public static final native HybridData initHybrid(byte[] bArr);

    public final void addRewriteRules(List list) {
        String str;
        String str2;
        C14360o3.A0B(list, 0);
        int size = list.size();
        int[] iArr = new int[size];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C26691Qy c26691Qy = (C26691Qy) it.next();
            int i2 = i + 1;
            C1AP c1ap = this.flatBufferBuilder;
            String str3 = null;
            if (c26691Qy != null) {
                str = c26691Qy.A00;
            } else {
                str = null;
            }
            int A02 = c1ap.A02(str);
            C1AP c1ap2 = this.flatBufferBuilder;
            if (c26691Qy != null) {
                str2 = c26691Qy.A01;
            } else {
                str2 = null;
            }
            int A022 = c1ap2.A02(str2);
            C1AP c1ap3 = this.flatBufferBuilder;
            if (c26691Qy != null) {
                str3 = c26691Qy.toString();
            }
            int A023 = c1ap3.A02(str3);
            c1ap.A03();
            c1ap.A05(2, A023);
            c1ap.A05(1, A022);
            c1ap.A05(0, A02);
            iArr[i] = c1ap.A00();
            i = i2;
        }
        C1AP c1ap4 = this.flatBufferBuilder;
        c1ap4.A07(4, size, 4);
        for (int i3 = size - 1; i3 >= 0; i3--) {
            c1ap4.A04(iArr[i3]);
        }
        this.ruleVector = c1ap4.A01();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.XjW, java.lang.Object] */
    static {
        C09170dP.A0C("zeronativerequestinterceptor");
    }

    public final void buildNative() {
        int i = this.ruleVector;
        if (i == -1) {
            this.flatBufferBuilder.A07(4, 0, 4);
            i = this.flatBufferBuilder.A01();
            this.ruleVector = i;
        }
        C1AP c1ap = this.flatBufferBuilder;
        c1ap.A03();
        c1ap.A05(2, i);
        int A00 = c1ap.A00();
        C1AP c1ap2 = this.flatBufferBuilder;
        c1ap2.A06(c1ap2.A00, 4);
        c1ap2.A04(A00);
        c1ap2.A06.position(c1ap2.A03);
        C1AP c1ap3 = this.flatBufferBuilder;
        int i2 = c1ap3.A03;
        byte[] bArr = new byte[c1ap3.A06.capacity() - c1ap3.A03];
        c1ap3.A06.position(i2);
        c1ap3.A06.get(bArr);
        this.mHybridData = initHybrid(bArr);
    }
}

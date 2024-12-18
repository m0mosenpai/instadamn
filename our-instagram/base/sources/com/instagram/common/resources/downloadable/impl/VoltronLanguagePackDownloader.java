package com.instagram.common.resources.downloadable.impl;

import X.AbstractC12990ll;
import X.AbstractC27081Th;
import X.AbstractC48302Jv;
import X.AnonymousClass001;
import X.C006802i;
import X.C05F;
import X.C11T;
import X.C1RQ;
import X.C1RR;
import X.C1U2;
import X.C2Ju;
import X.EnumC27091Ti;
import X.MTC;
import X.MTD;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.enums.EnumEntries;

/* loaded from: classes.dex */
public final class VoltronLanguagePackDownloader implements CallerContextable {
    public AbstractC12990ll A00;
    public Context A01;
    public final C1RR A02;

    public final void A01(Locale locale) {
        C006802i c006802i;
        int i;
        C11T.A05("This operation can't be run on UI thread.");
        C006802i c006802i2 = C006802i.A0p;
        c006802i2.markerStart(30478405);
        c006802i2.markerAnnotate(30478405, "locale", locale.toString());
        String A0R = AnonymousClass001.A0R("i18n_", AbstractC27081Th.A01(locale));
        EnumEntries enumEntries = EnumC27091Ti.A02;
        EnumC27091Ti A00 = C1U2.A00(A0R);
        boolean A05 = C1RQ.A00().A05(A00);
        try {
            C2Ju A002 = AbstractC48302Jv.A00(this.A01.getApplicationContext());
            if (A05) {
                String A003 = A00(C1RQ.A00().A02(A0R));
                if (A003.equals(ServerW3CShippingAddressConstants.POSTAL_CODE)) {
                    A002.AOV(Arrays.asList(A0R));
                }
                c006802i = C006802i.A0p;
                i = 30478405;
                c006802i.markerAnnotate(30478405, "voltron_module_type", A003);
                c006802i.markerAnnotate(30478405, "is_from_cache", true);
            } else {
                A002.AOV(Arrays.asList(A0R));
                MTC mtc = new MTC(A00);
                mtc.A03 = C05F.A00;
                mtc.A00 = 10000L;
                MTD mtd = new MTD(mtc);
                C1RQ A004 = C1RQ.A00();
                AbstractC12990ll abstractC12990ll = this.A00;
                A004.A03(abstractC12990ll, mtd);
                C1RQ.A00().A04(abstractC12990ll, mtd);
                String A005 = A00(C1RQ.A00().A02(A0R));
                c006802i = C006802i.A0p;
                i = 30478405;
                c006802i.markerAnnotate(30478405, "voltron_module_type", A005);
                c006802i.markerAnnotate(30478405, "is_from_cache", false);
            }
            c006802i.markerEnd(i, (short) 2);
        } catch (Exception e) {
            C006802i c006802i3 = C006802i.A0p;
            String message = e.getMessage();
            if (message == null) {
                message = "null";
            }
            c006802i3.markerAnnotate(30478405, "error_message", message);
            c006802i3.markerEnd(30478405, (short) 3);
        }
    }

    public VoltronLanguagePackDownloader(Context context, AbstractC12990ll abstractC12990ll) {
        this.A00 = abstractC12990ll;
        this.A01 = context;
        C1RQ.A03 = new C1RQ(context);
        this.A02 = new C1RR(context, abstractC12990ll);
    }

    public static String A00(File file) {
        if (file.getName().endsWith(".apk")) {
            return "apk";
        }
        if (file.getName().endsWith(".zip")) {
            return ServerW3CShippingAddressConstants.POSTAL_CODE;
        }
        return "unknown";
    }
}

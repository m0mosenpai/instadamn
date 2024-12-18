package com.facebook.browser.iabjs.ota.instagram;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC16850sd;
import X.AbstractC23611Dp;
import X.AbstractC25228BEl;
import X.AbstractC31176DnK;
import X.AbstractC54919OQu;
import X.AbstractC58317Pt9;
import X.C06090Tz;
import X.C09530e4;
import X.C0eB;
import X.C18U;
import X.C54957OSh;
import X.C55010OVt;
import X.C55026OXd;
import X.C57291PcD;
import X.C57292PcE;
import X.C57293PcF;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.O1I;
import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$handleHttpResponseOnComplete$1", f = "IgIABJSScriptFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgIABJSScriptFetcher$handleHttpResponseOnComplete$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ O1I A02;
    public final /* synthetic */ C55026OXd A03;
    public final /* synthetic */ QuickPerformanceLogger A04;
    public final /* synthetic */ ByteArrayOutputStream A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgIABJSScriptFetcher$handleHttpResponseOnComplete$1(Context context, O1I o1i, C55026OXd c55026OXd, QuickPerformanceLogger quickPerformanceLogger, ByteArrayOutputStream byteArrayOutputStream, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = c55026OXd;
        this.A01 = context;
        this.A06 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A04 = quickPerformanceLogger;
        this.A00 = i;
        this.A05 = byteArrayOutputStream;
        this.A02 = o1i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C55026OXd c55026OXd = this.A03;
        Context context = this.A01;
        String str = this.A06;
        String str2 = this.A08;
        String str3 = this.A07;
        String str4 = this.A09;
        QuickPerformanceLogger quickPerformanceLogger = this.A04;
        int i = this.A00;
        return new IgIABJSScriptFetcher$handleHttpResponseOnComplete$1(context, this.A02, c55026OXd, quickPerformanceLogger, this.A05, str, str2, str3, str4, interfaceC23621Ds, i);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgIABJSScriptFetcher$handleHttpResponseOnComplete$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        UserSession userSession;
        C06090Tz c06090Tz;
        C09530e4 A1L;
        Object obj2;
        String str2;
        AbstractC09560e7.A00(obj);
        Context context = this.A01;
        String str3 = this.A06;
        String str4 = this.A08;
        String str5 = this.A07;
        String str6 = this.A09;
        QuickPerformanceLogger quickPerformanceLogger = this.A04;
        int i = this.A00;
        ByteArrayOutputStream byteArrayOutputStream = this.A05;
        O1I o1i = this.A02;
        try {
            try {
                quickPerformanceLogger.markerStart(646461712, i);
                quickPerformanceLogger.markerAnnotate(646461712, i, "script_name", str5);
                quickPerformanceLogger.markerAnnotate(646461712, i, "file_name", str3);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(context.openFileOutput(str3, 0));
                    try {
                        AbstractC54919OQu.A00(byteArrayInputStream, bufferedOutputStream);
                        bufferedOutputStream.close();
                        byteArrayInputStream.close();
                        C54957OSh c54957OSh = C54957OSh.A00;
                        AbstractC167007dF.A1K(str5, str6);
                        AbstractC31176DnK.A1X(C54957OSh.A02, str5, str6);
                        userSession = C54957OSh.A01;
                        c06090Tz = C06090Tz.A06;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            e = e;
            str = "file_not_found error";
            C55026OXd.A00(quickPerformanceLogger, "file_not_found error", e.getMessage(), i, 646461712);
            C55026OXd.A01(e, str, str4, str5, str6, 646448498);
            C55010OVt.A00(o1i.A00);
            byteArrayOutputStream.close();
            return C0eB.A00;
        } catch (IOException e2) {
            e = e2;
            str = "io_error";
            C55026OXd.A00(quickPerformanceLogger, "io_error", e.getMessage(), i, 646461712);
            C55026OXd.A01(e, str, str4, str5, str6, 646448498);
            C55010OVt.A00(o1i.A00);
            byteArrayOutputStream.close();
            return C0eB.A00;
        }
        if (C18U.A06(c06090Tz, userSession, 36322800422365845L)) {
            obj2 = C57291PcD.A00;
            str2 = "autofill_contact_nonce_experiment";
        } else if (C18U.A06(c06090Tz, userSession, 36322800422169234L)) {
            obj2 = C57292PcE.A00;
            str2 = "autofill_contact_js_v2";
        } else {
            A1L = AbstractC166987dD.A1L(AbstractC58317Pt9.A00(230), C57293PcF.A00);
            AbstractC25228BEl.A1P(AbstractC16850sd.A0M(A1L).get(str5));
            quickPerformanceLogger.markerEnd(646461712, i, (short) 2);
            C55010OVt.A00(o1i.A00);
            byteArrayOutputStream.close();
            return C0eB.A00;
        }
        A1L = AbstractC166987dD.A1L(str2, obj2);
        AbstractC25228BEl.A1P(AbstractC16850sd.A0M(A1L).get(str5));
        quickPerformanceLogger.markerEnd(646461712, i, (short) 2);
        C55010OVt.A00(o1i.A00);
        byteArrayOutputStream.close();
        return C0eB.A00;
    }
}

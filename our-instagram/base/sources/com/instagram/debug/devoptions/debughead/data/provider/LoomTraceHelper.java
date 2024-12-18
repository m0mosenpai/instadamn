package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC19830yC;
import X.AbstractC31171DnF;
import X.AbstractC54852fj;
import X.AnonymousClass001;
import X.C06360Vc;
import X.C0VL;
import X.C0VM;
import X.C12260kU;
import X.C19080wp;
import X.C9GR;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import com.facebook.profilo.ipc.TraceContext;
import com.instagram.debug.devoptions.apiperf.LoomTraceProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.LoomTraceDelegate;

/* loaded from: classes6.dex */
public class LoomTraceHelper implements LoomTraceProvider {
    public static LoomTraceHelper sInstance;
    public final Context mAppContext;
    public LoomTraceDelegate mDelegate;
    public boolean mIsTracing;

    public static synchronized LoomTraceHelper getInstance(Context context) {
        LoomTraceHelper loomTraceHelper;
        synchronized (LoomTraceHelper.class) {
            loomTraceHelper = sInstance;
            if (loomTraceHelper == null) {
                loomTraceHelper = new LoomTraceHelper(context);
                sInstance = loomTraceHelper;
            }
        }
        return loomTraceHelper;
    }

    @Override // com.instagram.debug.devoptions.apiperf.LoomTraceProvider
    public void startTrace() {
        C06360Vc c06360Vc;
        if (!this.mIsTracing && (c06360Vc = C06360Vc.A0A) != null) {
            C0VL.A00().A01(null, AbstractC19830yC.A00);
            C0VM.A00(c06360Vc);
            c06360Vc.A09(0L, C19080wp.A00, 1);
        }
        this.mIsTracing = true;
    }

    @Override // com.instagram.debug.devoptions.apiperf.LoomTraceProvider
    public void stopTrace() {
        String str;
        if (this.mIsTracing) {
            C06360Vc c06360Vc = C06360Vc.A0A;
            if (c06360Vc == null) {
                str = null;
            } else {
                TraceContext A01 = C06360Vc.A01(c06360Vc, null, C19080wp.A00, 0L);
                if (A01 == null) {
                    str = null;
                } else {
                    str = A01.A0D;
                }
            }
            String A0R = AnonymousClass001.A0R("a2 ", str);
            C06360Vc c06360Vc2 = C06360Vc.A0A;
            if (c06360Vc2 != null) {
                c06360Vc2.A08(0L, C19080wp.A00);
            }
            LoomTraceDelegate loomTraceDelegate = this.mDelegate;
            if (loomTraceDelegate != null) {
                loomTraceDelegate.onLoomTraceCompleted();
            }
            ClipboardManager clipboardManager = (ClipboardManager) AbstractC31171DnF.A0X(this.mAppContext);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(A0R, A0R));
            }
            Context context = (Context) AbstractC54852fj.A00();
            if (context != null) {
                Intent A04 = AbstractC31171DnF.A04();
                A04.setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", A0R).setType("text/plain");
                C12260kU.A00(context, Intent.createChooser(A04, null));
            } else {
                C9GR.A08(this.mAppContext, 2131975709, 1);
            }
        }
        this.mIsTracing = false;
    }

    public LoomTraceHelper(Context context) {
        this.mAppContext = context;
    }

    public void setDelegate(LoomTraceDelegate loomTraceDelegate) {
        this.mDelegate = loomTraceDelegate;
    }
}

package com.instagram.common.lispy.lang;

import X.C103394lF;
import X.C103404lG;
import X.C103414lH;
import X.C136246Fc;
import X.C136266Fe;
import X.C6FR;
import X.InterfaceC102974kY;
import X.InterfaceC103374lD;
import X.InterfaceC103384lE;
import com.facebook.minscript.compiler.MinsCompilerImpl$Helper;
import com.facebook.minscript.compiler.interfaces.MinsCompilerResult;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.util.List;

/* loaded from: classes2.dex */
public final class BloksScript implements InterfaceC103374lD {
    public final int A00;
    public final C103414lH A01;
    public final C103394lF A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.4lF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BloksScript(X.InterfaceC102974kY r4, java.lang.String r5, java.util.List r6, int r7) {
        /*
            r3 = this;
            r2 = 0
            X.4lF r1 = new X.4lF
            r1.<init>()
            X.4lG r0 = new X.4lG
            r0.<init>(r1, r2, r5)
            r1.A00 = r0
            if (r6 != 0) goto L16
            if (r4 != 0) goto L16
            r0 = 0
        L12:
            r3.<init>(r1, r0, r7)
            return
        L16:
            X.4lH r0 = new X.4lH
            r0.<init>(r4, r6)
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.lispy.lang.BloksScript.<init>(X.4kY, java.lang.String, java.util.List, int):void");
    }

    @Override // X.InterfaceC103384lE
    public final /* bridge */ /* synthetic */ InterfaceC103384lE AKr(InterfaceC102974kY interfaceC102974kY, List list) {
        return A00(interfaceC102974kY, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r3 == r4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.common.lispy.lang.BloksScript A00(X.InterfaceC102974kY r6, java.util.List r7) {
        /*
            r5 = this;
            X.4lH r4 = r5.A01
            r0 = 0
            if (r4 == 0) goto L20
            X.4kY r2 = r4.A00
            r1 = r2
            if (r6 == 0) goto L10
            if (r2 == 0) goto L10
            X.4kY r2 = r2.Cme(r6)
        L10:
            java.util.List r0 = r4.A01
            if (r7 != r0) goto L1a
            if (r2 != r1) goto L1a
            r3 = r4
        L17:
            if (r3 != r4) goto L27
        L19:
            return r5
        L1a:
            X.4lH r3 = new X.4lH
            r3.<init>(r2, r7)
            goto L17
        L20:
            if (r7 == 0) goto L19
            X.4lH r3 = new X.4lH
            r3.<init>(r0, r7)
        L27:
            X.4lF r2 = r5.A02
            int r1 = r5.A00
            com.instagram.common.lispy.lang.BloksScript r0 = new com.instagram.common.lispy.lang.BloksScript
            r0.<init>(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.lispy.lang.BloksScript.A00(X.4kY, java.util.List):com.instagram.common.lispy.lang.BloksScript");
    }

    @Override // X.InterfaceC103374lD
    public final void ASn(C6FR c6fr) {
        C103394lF c103394lF = this.A02;
        C103404lG c103404lG = c103394lF.A00;
        C136246Fc c136246Fc = c103404lG.A00;
        boolean z = false;
        if (c136246Fc != null) {
            z = true;
        }
        if (!Boolean.valueOf(z).booleanValue()) {
            if (c136246Fc == null) {
                String str = c103404lG.A01;
                if (str.startsWith("lispx")) {
                    str = str.substring(15);
                }
                try {
                    MinsCompilerResult doCompileWithLispyOffsets = MinsCompilerImpl$Helper.doCompileWithLispyOffsets(str.getBytes(ReactWebViewManager.HTML_ENCODING), false, false);
                    doCompileWithLispyOffsets.byteBuffer.order(ByteOrder.nativeOrder());
                    c103404lG = new C103404lG(c103404lG.A02, C136246Fc.A00(doCompileWithLispyOffsets), null);
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
            c103394lF.A00 = c103404lG;
        }
    }

    @Override // X.InterfaceC103384lE
    public final String Bqx() {
        C136246Fc c136246Fc = this.A02.A00.A00;
        if (c136246Fc != null) {
            return c136246Fc.A00;
        }
        return null;
    }

    @Override // X.InterfaceC103384lE
    public final InterfaceC102974kY Byi() {
        C103414lH c103414lH = this.A01;
        if (c103414lH == null) {
            return null;
        }
        return c103414lH.A00;
    }

    @Override // X.InterfaceC103374lD
    public final C136266Fe F9w() {
        C103394lF c103394lF = this.A02;
        C103414lH c103414lH = this.A01;
        C136246Fc c136246Fc = c103394lF.A00.A00;
        if (c136246Fc != null) {
            return new C136266Fe(c136246Fc.A01(0), c103414lH, null, null);
        }
        throw new IllegalStateException("getMinsClosure() was called while minsClosure is null. This normally happens when getMinsClosure() is called before calling \"ensurePrepared()\" method");
    }

    public BloksScript(C103394lF c103394lF, C103414lH c103414lH, int i) {
        this.A02 = c103394lF;
        this.A00 = i;
        this.A01 = c103414lH;
    }
}

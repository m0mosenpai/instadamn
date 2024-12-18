package X;

/* renamed from: X.UsR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67604UsR extends AbstractC70462WWz {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        if (r6.equals(com.facebook.react.modules.dialog.DialogModule.KEY_ITEMS) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004f, code lost:
    
        if (r6.equals("selected") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // X.AbstractC70462WWz, X.InterfaceC65496TlK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ebq(android.view.View r4, java.lang.Object r5, java.lang.String r6) {
        /*
            r3 = this;
            int r0 = r6.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case -1609594047: goto Ld;
                case -979805852: goto L21;
                case 94842723: goto L36;
                case 100526016: goto L40;
                case 1191572123: goto L49;
                case 1287124693: goto L52;
                default: goto L9;
            }
        L9:
            super.Ebq(r4, r5, r6)
            return
        Ld:
            java.lang.String r0 = "enabled"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            if (r5 == 0) goto L1d
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
        L1d:
            r4.setEnabled(r1)
            return
        L21:
            java.lang.String r0 = "prompt"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            if (r5 != 0) goto L33
            java.lang.String r5 = ""
        L2d:
            android.widget.Spinner r4 = (android.widget.Spinner) r4
            r4.setPrompt(r5)
            return
        L33:
            java.lang.String r5 = (java.lang.String) r5
            goto L2d
        L36:
            java.lang.String r0 = "color"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r1 = 2
            goto L5b
        L40:
            java.lang.String r0 = "items"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L81
            goto L9
        L49:
            java.lang.String r0 = "selected"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L8b
            goto L9
        L52:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r1 = 5
        L5b:
            r0 = 0
            switch(r1) {
                case 2: goto L70;
                case 3: goto L81;
                case 4: goto L8b;
                default: goto L5f;
            }
        L5f:
            if (r5 == 0) goto L6b
            java.lang.Number r5 = (java.lang.Number) r5
            int r0 = r5.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L6b:
            X.UDc r4 = (X.UDc) r4
            r4.A01 = r0
            return
        L70:
            if (r5 == 0) goto L7c
            java.lang.Number r5 = (java.lang.Number) r5
            int r0 = r5.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L7c:
            X.UDc r4 = (X.UDc) r4
            r4.A02 = r0
            return
        L81:
            com.facebook.react.uimanager.BaseViewManager r0 = r3.A00
            com.facebook.fbreact.views.picker.ReactDialogPickerManager r0 = (com.facebook.fbreact.views.picker.ReactDialogPickerManager) r0
            com.facebook.react.bridge.ReadableArray r5 = (com.facebook.react.bridge.ReadableArray) r5
            r0.setItems(r4, r5)
            return
        L8b:
            if (r5 == 0) goto L93
            java.lang.Number r5 = (java.lang.Number) r5
            int r2 = r5.intValue()
        L93:
            X.UDc r4 = (X.UDc) r4
            r4.setStagedSelection(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67604UsR.Ebq(android.view.View, java.lang.Object, java.lang.String):void");
    }
}

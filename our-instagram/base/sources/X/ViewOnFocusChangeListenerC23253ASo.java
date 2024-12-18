package X;

import android.view.View;

/* renamed from: X.ASo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnFocusChangeListenerC23253ASo implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public ViewOnFocusChangeListenerC23253ASo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    @Override // android.view.View.OnFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r4.A01
            X.Ah5 r1 = (X.C23853Ah5) r1
            boolean r0 = r1.A0B
            if (r0 != 0) goto L1a
            X.88W r0 = r1.A0J
            if (r6 == 0) goto L45
            r0.A00()
            X.AbstractC167007dF.A1C(r5)
            X.AbstractC13880nE.A0S(r5)
        L1a:
            return
        L1b:
            java.lang.Object r2 = r4.A01
            X.9Uv r2 = (X.C210989Uv) r2
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            X.9aC r1 = r2.A00
            if (r1 == 0) goto L1a
            boolean r0 = r1.A03
            if (r0 != 0) goto L1a
            if (r6 == 0) goto L1a
            X.A5W r0 = r2.A02
            int r3 = r1.A00
            X.AdP r2 = r0.A00
            X.BDv r0 = r2.A06
            if (r0 == 0) goto L41
            X.ABs r1 = r0.BKP()
            if (r1 == 0) goto L41
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A05 = r0
        L41:
            X.C23630AdP.A06(r2)
            return
        L45:
            r0.A01()
            X.AbstractC167007dF.A1C(r5)
            goto Lac
        L4c:
            r0 = 1204(0x4b4, float:1.687E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C14360o3.A0C(r5, r0)
            android.widget.EditText r5 = (android.widget.EditText) r5
            java.lang.Object r2 = r4.A01
            X.Aej r2 = (X.C23710Aej) r2
            java.lang.String r1 = "model"
            X.9kI r0 = r2.A00
            if (r6 != 0) goto La1
            if (r0 == 0) goto Lb0
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r0.A00
            java.lang.String r1 = r0.A03
            if (r1 == 0) goto L6f
            int r0 = r1.length()
            if (r0 != 0) goto L71
        L6f:
            java.lang.String r1 = "@"
        L71:
            r5.setText(r1)
            X.C23710Aej.A03(r2, r6)
            X.0do r0 = r2.A0E
            java.lang.Object r0 = r0.getValue()
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r5.setSelection(r0)
            r0 = r6 ^ 1
            X.C23710Aej.A04(r2, r0)
            X.0do r2 = r2.A0B
            android.view.View r0 = X.AbstractC166987dD.A0d(r2)
            android.view.View r1 = r0.findFocus()
            boolean r0 = r1 instanceof android.widget.EditText
            if (r0 == 0) goto La8
            X.AbstractC13880nE.A0R(r1)
            return
        La1:
            if (r0 == 0) goto Lb0
            com.instagram.api.schemas.StoryGroupMentionTappableData r0 = r0.A00
            java.lang.String r1 = r0.A03
            goto L71
        La8:
            android.view.View r5 = X.AbstractC166987dD.A0d(r2)
        Lac:
            X.AbstractC13880nE.A0O(r5)
            return
        Lb0:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnFocusChangeListenerC23253ASo.onFocusChange(android.view.View, boolean):void");
    }
}

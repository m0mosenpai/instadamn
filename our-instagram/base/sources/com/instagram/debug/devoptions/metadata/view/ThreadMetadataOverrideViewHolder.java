package com.instagram.debug.devoptions.metadata.view;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.B4Z;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C193328hC;
import X.C3OO;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideViewHolder extends C3OO {
    public final Delegate delegate;
    public final View editFieldContainer;
    public final IgTextView metadataBoolValue;
    public final IgTextView metadataName;
    public final IgEditText metadataValue;

    /* loaded from: classes6.dex */
    public interface Delegate {
        void onMetadataOverrideValueChanged();
    }

    public final void bind(ThreadMetadataOverride threadMetadataOverride) {
        Context context;
        int i;
        C14360o3.A0B(threadMetadataOverride, 0);
        this.metadataName.setText(threadMetadataOverride.name);
        if (C14360o3.A0K(threadMetadataOverride.returnType, Boolean.TYPE)) {
            setupForBoolField(threadMetadataOverride);
        } else {
            setupForValueField(threadMetadataOverride);
        }
        View view = this.editFieldContainer;
        boolean z = threadMetadataOverride.hasOverridden;
        if (z) {
            context = this.metadataName.getContext();
            i = R.attr.igds_color_success;
        } else if (!z) {
            context = this.metadataName.getContext();
            i = R.attr.igds_color_primary_background;
        } else {
            throw B4Z.A00();
        }
        view.setBackgroundColor(AbstractC167007dF.A09(context, i));
    }

    private final void setupForBoolField(final ThreadMetadataOverride threadMetadataOverride) {
        String str;
        IgTextView igTextView = this.metadataBoolValue;
        Object obj = threadMetadataOverride.value;
        if (obj == null || (str = obj.toString()) == null) {
            str = "n/a";
        }
        igTextView.setText(str);
        C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder$setupForBoolField$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-673201181);
                C193328hC A0I = AbstractC31171DnF.A0I(view.getContext());
                final ThreadMetadataOverride threadMetadataOverride2 = ThreadMetadataOverride.this;
                final ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder = this;
                A0I.A0d(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder$setupForBoolField$1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ThreadMetadataOverride.this.update(AbstractC166997dE.A0b());
                        ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder2 = threadMetadataOverrideViewHolder;
                        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        threadMetadataOverrideViewHolder2.delegate.onMetadataOverrideValueChanged();
                    }
                }, "True");
                final ThreadMetadataOverride threadMetadataOverride3 = ThreadMetadataOverride.this;
                final ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder2 = this;
                A0I.A0b(new DialogInterface.OnClickListener() { // from class: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder$setupForBoolField$1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ThreadMetadataOverride.this.update(AbstractC166997dE.A0a());
                        ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder3 = threadMetadataOverrideViewHolder2;
                        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        threadMetadataOverrideViewHolder3.delegate.onMetadataOverrideValueChanged();
                    }
                }, "False");
                AbstractC166987dD.A1W(A0I);
                C0f9.A0C(-1252189080, A05);
            }
        }, this.metadataBoolValue);
        this.metadataBoolValue.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (X.C14360o3.A0K(r1, java.lang.Long.TYPE) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupForValueField(final com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride r4) {
        /*
            r3 = this;
            com.instagram.common.ui.base.IgEditText r2 = r3.metadataValue
            java.lang.Class r1 = r4.returnType
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L44
            java.lang.Object r1 = r4.value
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
        L10:
            X.C14360o3.A0C(r1, r0)
        L13:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r2.setHint(r0)
            com.instagram.common.ui.base.IgEditText r2 = r3.metadataValue
            java.lang.Class r1 = r4.returnType
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L2f
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r1 = X.C14360o3.A0K(r1, r0)
            r0 = 1
            if (r1 == 0) goto L30
        L2f:
            r0 = 2
        L30:
            r2.setInputType(r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.metadataValue
            com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder$setupForValueField$1 r0 = new com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder$setupForValueField$1
            r0.<init>()
            r1.setOnEditorActionListener(r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.metadataValue
            r0 = 0
            r1.setVisibility(r0)
            return
        L44:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r4.value
            goto L13
        L4f:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L60
            java.lang.Object r1 = r4.value
            r0 = 10
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L10
        L60:
            java.lang.String r1 = "n/a"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder.setupForValueField(com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideViewHolder(View view, Delegate delegate) {
        super(view);
        AbstractC167017dG.A1P(view, delegate);
        this.delegate = delegate;
        this.metadataName = AbstractC31175DnJ.A0L(view, R.id.metadata_name);
        this.metadataValue = (IgEditText) AbstractC166987dD.A0c(view, R.id.metadata_value_value_field);
        this.metadataBoolValue = AbstractC31175DnJ.A0L(view, R.id.metadata_name_boolean_field);
        this.editFieldContainer = AbstractC166987dD.A0c(view, R.id.editfields_container);
    }
}

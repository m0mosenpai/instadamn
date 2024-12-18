package com.instagram.debug.devoptions.metadata.view;

import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC31175DnJ;
import X.AbstractC66422zJ;
import X.C14360o3;
import X.C3OO;
import X.InterfaceC66482zP;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder;

/* loaded from: classes6.dex */
public final class ThreadMetadataOverrideItemDefinition extends AbstractC66422zJ {
    public final ThreadMetadataOverrideViewHolder.Delegate delegate;

    public ThreadMetadataOverrideItemDefinition(ThreadMetadataOverrideViewHolder.Delegate delegate) {
        C14360o3.A0B(delegate, 1);
        this.delegate = delegate;
    }

    @Override // X.AbstractC66422zJ
    public ThreadMetadataOverrideViewHolder createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new ThreadMetadataOverrideViewHolder(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_metadata_override_item, false), this.delegate);
    }

    @Override // X.AbstractC66422zJ
    public /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ThreadMetadataOverride threadMetadataOverride = (ThreadMetadataOverride) interfaceC66482zP;
        ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder = (ThreadMetadataOverrideViewHolder) c3oo;
        AbstractC167017dG.A1N(threadMetadataOverride, threadMetadataOverrideViewHolder);
        threadMetadataOverrideViewHolder.bind(threadMetadataOverride);
    }

    @Override // X.AbstractC66422zJ
    public Class modelClass() {
        return ThreadMetadataOverride.class;
    }

    public void bind(ThreadMetadataOverride threadMetadataOverride, ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder) {
        AbstractC167017dG.A1N(threadMetadataOverride, threadMetadataOverrideViewHolder);
        threadMetadataOverrideViewHolder.bind(threadMetadataOverride);
    }
}

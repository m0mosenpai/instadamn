package com.instagram.debug.devoptions.search.bootstrap;

import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AnonymousClass001;
import X.C0f9;
import X.C0fQ;
import X.C127165ou;
import X.C2UU;
import X.C3OO;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class BootstrapSurfaceAdapter extends C2UU {
    public final Delegate mDelegate;
    public final List mSurfaces = new ArrayList();

    /* loaded from: classes11.dex */
    public interface Delegate {
        void onSurfaceClick(C127165ou c127165ou);

        void onSurfaceLongClick(C127165ou c127165ou);
    }

    /* loaded from: classes11.dex */
    public final class SurfaceViewHolder extends C3OO {
        public final TextView mNameVew;
        public final TextView mRankTokenView;
        public final TextView mScoresCountView;
        public final TextView mTtlView;

        public SurfaceViewHolder(View view) {
            super(view);
            this.mNameVew = (TextView) view.requireViewById(R.id.surface_name);
            this.mRankTokenView = (TextView) view.requireViewById(R.id.surface_rank_token);
            this.mScoresCountView = (TextView) view.requireViewById(R.id.surface_count);
            this.mTtlView = (TextView) view.requireViewById(R.id.surface_ttl);
            C0fQ.A00(new View.OnClickListener() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceAdapter.SurfaceViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int A05 = C0f9.A05(-223152910);
                    SurfaceViewHolder surfaceViewHolder = SurfaceViewHolder.this;
                    BootstrapSurfaceAdapter bootstrapSurfaceAdapter = BootstrapSurfaceAdapter.this;
                    bootstrapSurfaceAdapter.mDelegate.onSurfaceClick((C127165ou) bootstrapSurfaceAdapter.mSurfaces.get(surfaceViewHolder.getBindingAdapterPosition()));
                    C0f9.A0C(570325935, A05);
                }
            }, view);
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.instagram.debug.devoptions.search.bootstrap.BootstrapSurfaceAdapter.SurfaceViewHolder.2
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view2) {
                    SurfaceViewHolder surfaceViewHolder = SurfaceViewHolder.this;
                    BootstrapSurfaceAdapter bootstrapSurfaceAdapter = BootstrapSurfaceAdapter.this;
                    bootstrapSurfaceAdapter.mDelegate.onSurfaceLongClick((C127165ou) bootstrapSurfaceAdapter.mSurfaces.get(surfaceViewHolder.getBindingAdapterPosition()));
                    return true;
                }
            });
        }

        public void bind(C127165ou c127165ou) {
            this.mNameVew.setText(c127165ou.A01);
            this.mRankTokenView.setText(AnonymousClass001.A0R("Rank Token:\t\t", c127165ou.A02));
            TextView textView = this.mScoresCountView;
            Map map = c127165ou.A03;
            if (map == null) {
                map = Collections.emptyMap();
            }
            textView.setText(AnonymousClass001.A0O("Count:\t\t", map.size()));
            this.mTtlView.setText(AnonymousClass001.A0e("TTL:\t\t", " seconds.", c127165ou.A00));
        }
    }

    @Override // X.C2UU
    public void onBindViewHolder(SurfaceViewHolder surfaceViewHolder, int i) {
        surfaceViewHolder.bind((C127165ou) this.mSurfaces.get(i));
    }

    @Override // X.C2UU
    public SurfaceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new SurfaceViewHolder(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.bootstrap_surface));
    }

    public void setSurfaces(List list) {
        this.mSurfaces.clear();
        this.mSurfaces.addAll(list);
        notifyDataSetChanged();
    }

    public BootstrapSurfaceAdapter(Delegate delegate) {
        this.mDelegate = delegate;
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(-1480227403);
        int size = this.mSurfaces.size();
        C0f9.A0A(798118539, A03);
        return size;
    }
}

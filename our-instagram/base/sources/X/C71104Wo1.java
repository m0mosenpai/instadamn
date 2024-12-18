package X;

import android.view.View;
import com.instagram.analytics.eventlog.EventLogListFragment;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;

/* renamed from: X.Wo1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71104Wo1 implements GYX {
    public final int A00;
    public final Object A01;

    public C71104Wo1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GYX
    public final View getRowView() {
        TypeaheadHeader typeaheadHeader;
        switch (this.A00) {
            case 0:
                typeaheadHeader = ((EventLogListFragment) this.A01).A03;
                if (typeaheadHeader == null) {
                    throw new IllegalStateException(MSV.A00(26));
                }
                return typeaheadHeader;
            case 1:
                typeaheadHeader = ((V1a) this.A01).A01;
                if (typeaheadHeader == null) {
                    throw new IllegalStateException(MSV.A00(26));
                }
                return typeaheadHeader;
            default:
                typeaheadHeader = ((V1W) this.A01).A04;
                if (typeaheadHeader == null) {
                    throw new IllegalStateException(MSV.A00(26));
                }
                return typeaheadHeader;
        }
    }
}

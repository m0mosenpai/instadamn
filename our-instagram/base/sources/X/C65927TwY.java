package X;

import com.instagram.discovery.related.model.RelatedItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.TwY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65927TwY implements C3A6 {
    public final int A00;
    public final Object A01;

    public C65927TwY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C3A6
    public final Object CAM(int i) {
        Object A0O;
        switch (this.A00) {
            case 0:
                UGU ugu = (UGU) this.A01;
                if (ugu instanceof V7o) {
                    if (i != 0) {
                        A0O = AbstractC001800i.A0O(ugu.A04, i - 1);
                    }
                    return null;
                }
                A0O = AbstractC001800i.A0O(ugu.A04, i);
                return (RelatedItem) A0O;
            case 1:
            default:
                return null;
            case 2:
                UBD ubd = (UBD) this.A01;
                C14360o3.A0B(ubd, 0);
                Object item = ubd.getItem(i);
                if (!(item instanceof C47L)) {
                    return item;
                }
                C47L c47l = (C47L) item;
                if (c47l.A07 == C47R.A0A) {
                    return c47l.A00();
                }
                return null;
            case 3:
                return ((C31440Drk) this.A01).A01(i);
            case 4:
                return ((C69392Vmc) this.A01).A03.get(i);
        }
    }

    @Override // X.C3A6
    public final Class CAN(Object obj) {
        switch (this.A00) {
            case 0:
            case 2:
            case 3:
                C14360o3.A0B(obj, 0);
                return obj.getClass();
            case 1:
                return ExploreTopicCluster.class;
            case 4:
                return C38321qM.class;
            default:
                return null;
        }
    }
}

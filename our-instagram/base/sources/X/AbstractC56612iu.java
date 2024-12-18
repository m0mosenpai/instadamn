package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56612iu {
    public byte A00;
    public byte A01;
    public float A04;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0I;
    public float A0J;
    public int A0M;
    public WWQ A0Q;
    public WWS A0R;
    public C56502ij A0S;
    public C56502ij A0T;
    public C56502ij A0U;
    public AbstractC1348968m A0V;
    public AbstractC56612iu A0W;
    public AbstractC1348868e A0X;
    public AbstractC1348868e A0Y;
    public AbstractC1348868e A0Z;
    public AbstractC1348868e A0a;
    public AbstractC1348868e A0b;
    public AbstractC1348868e A0c;
    public AbstractC1348868e A0d;
    public C56562ip A0e;
    public C56562ip A0f;
    public C3LS A0g;
    public C3LS A0h;
    public C68i A0i;
    public C68i A0j;
    public C68i A0k;
    public C68i A0l;
    public C68i A0m;
    public C68i A0n;
    public C68i A0o;
    public C68i A0p;
    public C68i A0q;
    public AbstractC56602it A0r;
    public String A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public float[] A0w;
    public AbstractC56612iu[] A0x;
    public C68i[] A0y;
    public String[] A0z;
    public int[] A10;
    public int A0N = -1;
    public int A0P = -1;
    public float A0E = 1.0f;
    public float A06 = 1.0f;
    public float A0H = -1.0f;
    public float A0F = -1.0f;
    public float A0G = -1.0f;
    public float A05 = -1.0f;
    public byte A03 = 0;
    public byte A02 = 0;
    public int A0O = -1;
    public int A0L = -1;
    public int A0K = -1;

    public final void A00(Map map, WWR[] wwrArr) {
        AbstractC56612iu abstractC56612iu = this.A0W;
        if (abstractC56612iu != null) {
            abstractC56612iu.A00(map, wwrArr);
        }
        AbstractC56612iu[] abstractC56612iuArr = this.A0x;
        if (abstractC56612iuArr != null) {
            for (AbstractC56612iu abstractC56612iu2 : abstractC56612iuArr) {
                abstractC56612iu2.A00(map, wwrArr);
            }
        }
        String[] strArr = this.A0z;
        if (strArr != null) {
            for (String str : strArr) {
                List list = (List) map.get(str);
                if (list == null) {
                    list = new ArrayList();
                    map.put(str, list);
                }
                list.add(this);
            }
        }
        if (wwrArr != null) {
            for (WWR wwr : wwrArr) {
                for (int i = 0; i < wwr.A00.length; i++) {
                    if (this.A0M == wwr.A00[i]) {
                        wwr.A01[i] = this;
                    }
                }
            }
        }
    }
}

package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Jfn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44184Jfn {
    public boolean A00;
    public final C006802i A01;

    public static void A00(C006802i c006802i, Map map, int i) {
        String str;
        MarkerEditor withMarker = c006802i.withMarker(i, 0);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            Object value = A1K.getValue();
            if (value instanceof Integer) {
                withMarker.annotate(A17, AbstractC166987dD.A0H(value));
            } else if (value instanceof Long) {
                withMarker.annotate(A17, AbstractC166987dD.A0N(value));
            } else if (!(value instanceof Double) && !(value instanceof Number)) {
                if (value instanceof Boolean) {
                    withMarker.annotate(A17, AbstractC166987dD.A1a(value) & true);
                } else {
                    if (value instanceof String) {
                        str = (String) value;
                    } else if (value instanceof int[]) {
                        withMarker.annotate(A17, (int[]) value);
                    } else if (value instanceof long[]) {
                        withMarker.annotate(A17, (long[]) value);
                    } else if (value instanceof double[]) {
                        withMarker.annotate(A17, (double[]) value);
                    } else if (value instanceof boolean[]) {
                        withMarker.annotate(A17, (boolean[]) value);
                    } else {
                        str = String.valueOf(value);
                    }
                    withMarker.annotate(A17, str);
                }
            } else {
                withMarker.annotate(A17, ((Number) value).doubleValue());
            }
        }
        withMarker.markerEditingCompleted();
    }

    public final void A01(int i, int i2, String str, Map map) {
        String str2;
        if (this.A00) {
            MarkerEditor withMarker = this.A01.withMarker(i, i2);
            PointEditor pointEditor = withMarker.pointEditor(str);
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    pointEditor.addPointData(str3, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    pointEditor.addPointData(str3, ((Number) value).longValue());
                } else if (!(value instanceof Double) && !(value instanceof Number)) {
                    if (value instanceof Boolean) {
                        pointEditor.addPointData(str3, ((Boolean) value).booleanValue() & true);
                    } else {
                        if (value instanceof String) {
                            str2 = (String) value;
                        } else if (value instanceof int[]) {
                            pointEditor.addPointData(str3, (int[]) value);
                        } else if (value instanceof long[]) {
                            pointEditor.addPointData(str3, (long[]) value);
                        } else if (value instanceof double[]) {
                            pointEditor.addPointData(str3, (double[]) value);
                        } else if (value instanceof boolean[]) {
                            pointEditor.addPointData(str3, (boolean[]) value);
                        } else {
                            str2 = String.valueOf(value);
                        }
                        pointEditor.addPointData(str3, str2);
                    }
                } else {
                    pointEditor.addPointData(str3, ((Number) value).doubleValue());
                }
            }
            pointEditor.pointEditingCompleted();
            withMarker.markerEditingCompleted();
        }
    }

    public final void A02(int i, int i2, Map map) {
        String str;
        if (this.A00) {
            C006802i c006802i = this.A01;
            c006802i.markerStart(i, i2);
            if (map != null && !map.isEmpty() && this.A00) {
                MarkerEditor withMarker = c006802i.withMarker(i, 0);
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        withMarker.annotate(str2, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        withMarker.annotate(str2, ((Number) value).longValue());
                    } else if (!(value instanceof Double) && !(value instanceof Number)) {
                        if (value instanceof Boolean) {
                            withMarker.annotate(str2, ((Boolean) value).booleanValue() & true);
                        } else {
                            if (value instanceof String) {
                                str = (String) value;
                            } else if (value instanceof int[]) {
                                withMarker.annotate(str2, (int[]) value);
                            } else if (value instanceof long[]) {
                                withMarker.annotate(str2, (long[]) value);
                            } else if (value instanceof double[]) {
                                withMarker.annotate(str2, (double[]) value);
                            } else if (value instanceof boolean[]) {
                                withMarker.annotate(str2, (boolean[]) value);
                            } else {
                                str = String.valueOf(value);
                            }
                            withMarker.annotate(str2, str);
                        }
                    } else {
                        withMarker.annotate(str2, ((Number) value).doubleValue());
                    }
                }
                withMarker.markerEditingCompleted();
            }
        }
    }

    public final void A03(Throwable th, int i, int i2) {
        short s;
        if (this.A00) {
            C006802i c006802i = this.A01;
            if (th == null) {
                s = 2;
            } else {
                c006802i.markerAnnotate(i, i2, "error", th.getMessage());
                s = 3;
            }
            c006802i.markerEnd(i, i2, s);
        }
    }

    public AbstractC44184Jfn(C006802i c006802i) {
        this.A01 = c006802i;
    }
}

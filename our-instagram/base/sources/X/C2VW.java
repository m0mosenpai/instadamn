package X;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.2VW, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2VW {
    public static final int A00(EnumC48482Kp enumC48482Kp) {
        C14360o3.A0B(enumC48482Kp, 0);
        switch (enumC48482Kp) {
            case ENQUEUED:
                return 0;
            case RUNNING:
                return 1;
            case SUCCEEDED:
                return 2;
            case FAILED:
                return 3;
            case BLOCKED:
                return 4;
            case CANCELLED:
                return 5;
            default:
                throw new RuntimeException();
        }
    }

    public static final int A01(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return 1;
            }
            throw new RuntimeException();
        }
        return 0;
    }

    public static final int A02(Integer num) {
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && num == C05F.A0j) {
                                return 5;
                            }
                            throw new IllegalArgumentException(AnonymousClass001.A0g("Could not convert ", C50T.A00(num), " to int"));
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static final int A03(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return 1;
            }
            throw new RuntimeException();
        }
        return 0;
    }

    public static final LinkedHashSet A08(byte[] bArr) {
        ObjectInputStream objectInputStream;
        C14360o3.A0B(bArr, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!(bArr.length == 0)) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        android.net.Uri parse = android.net.Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        C14360o3.A07(parse);
                        linkedHashSet.add(new SNU(readBoolean, parse));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } finally {
                }
            } finally {
            }
        } else {
            return linkedHashSet;
        }
    }

    public static final byte[] A09(java.util.Set set) {
        C14360o3.A0B(set, 0);
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    SNU snu = (SNU) it.next();
                    objectOutputStream.writeUTF(snu.A00.toString());
                    objectOutputStream.writeBoolean(snu.A01);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C14360o3.A07(byteArray);
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final EnumC48482Kp A04(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EnumC48482Kp.CANCELLED;
                            }
                            throw new IllegalArgumentException(AnonymousClass001.A0c("Could not convert ", " to State", i));
                        }
                        return EnumC48482Kp.BLOCKED;
                    }
                    return EnumC48482Kp.FAILED;
                }
                return EnumC48482Kp.SUCCEEDED;
            }
            return EnumC48482Kp.RUNNING;
        }
        return EnumC48482Kp.ENQUEUED;
    }

    public static final Integer A05(int i) {
        if (i != 0) {
            if (i == 1) {
                return C05F.A01;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0c("Could not convert ", " to BackoffPolicy", i));
        }
        return C05F.A00;
    }

    public static final Integer A06(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return C05F.A0j;
                            }
                            throw new IllegalArgumentException(AnonymousClass001.A0c("Could not convert ", " to NetworkType", i));
                        }
                        return C05F.A0Y;
                    }
                    return C05F.A0N;
                }
                return C05F.A0C;
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static final Integer A07(int i) {
        if (i != 0) {
            if (i == 1) {
                return C05F.A01;
            }
            throw new IllegalArgumentException(AnonymousClass001.A0c("Could not convert ", " to OutOfQuotaPolicy", i));
        }
        return C05F.A00;
    }
}

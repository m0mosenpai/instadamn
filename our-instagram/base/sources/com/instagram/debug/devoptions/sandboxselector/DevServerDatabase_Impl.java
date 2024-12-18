package com.instagram.debug.devoptions.sandboxselector;

import X.A6Q;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC28801aI;
import X.AbstractC58317Pt9;
import X.AbstractC72046XLm;
import X.AbstractC72048XLo;
import X.AbstractC72049XLp;
import X.C23008ACh;
import X.C28381Yz;
import X.C28621Zy;
import X.C2LL;
import X.C3EP;
import X.InterfaceC29101an;
import X.InterfaceC37481ol;
import X.RrF;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
public final class DevServerDatabase_Impl extends DevServerDatabase {
    public volatile DevServerDao _devServerDao;

    @Override // X.C1YP
    public C28621Zy createInvalidationTracker() {
        return new C28621Zy(this, AbstractC72046XLm.A0g(0), AbstractC72046XLm.A0g(0), AbstractC58317Pt9.A00(294));
    }

    @Override // X.C1YP
    public InterfaceC29101an createOpenHelper(C28381Yz c28381Yz) {
        return AbstractC72048XLo.A06(c28381Yz, new AbstractC28801aI(2) { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDatabase_Impl.1
            @Override // X.AbstractC28801aI
            public void onPostMigrate(InterfaceC37481ol interfaceC37481ol) {
            }

            @Override // X.AbstractC28801aI
            public A6Q onValidateSchema(InterfaceC37481ol interfaceC37481ol) {
                HashMap A0g = AbstractC72046XLm.A0g(5);
                AbstractC72048XLo.A1O("url", "TEXT", A0g);
                boolean A0X = AbstractC72049XLp.A0X(DevServerEntity.COLUMN_HOST_TYPE, "TEXT", A0g);
                A0g.put(DevServerEntity.COLUMN_DESCRIPTION, AbstractC72048XLo.A05(DevServerEntity.COLUMN_DESCRIPTION, "TEXT", null, A0X ? 1 : 0));
                String A00 = AbstractC58317Pt9.A00(136);
                A0g.put(A00, AbstractC72048XLo.A05(A00, "INTEGER", null, A0X ? 1 : 0));
                String A002 = AbstractC58317Pt9.A00(701);
                HashSet A0M = AbstractC72048XLo.A0M(A002, AbstractC72048XLo.A05(A002, "INTEGER", null, A0X ? 1 : 0), A0g, A0X ? 1 : 0);
                HashSet hashSet = new HashSet(A0X ? 1 : 0);
                String A003 = AbstractC58317Pt9.A00(294);
                C23008ACh c23008ACh = new C23008ACh(A003, A0g, A0M, hashSet);
                C23008ACh A004 = RrF.A00(interfaceC37481ol, A003);
                if (!c23008ACh.equals(A004)) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("internal_dev_servers(com.instagram.debug.devoptions.sandboxselector.DevServerEntity).\n Expected:\n");
                    A1C.append(c23008ACh);
                    return new A6Q(A0X, AbstractC167017dG.A0n(A004, "\n Found:\n", A1C));
                }
                return new A6Q(true, null);
            }

            @Override // X.AbstractC28801aI
            public void createAllTables(InterfaceC37481ol interfaceC37481ol) {
                AbstractC72046XLm.A0l(interfaceC37481ol, "CREATE TABLE IF NOT EXISTS `internal_dev_servers` (`url` TEXT NOT NULL, `host_type` TEXT NOT NULL, `description` TEXT NOT NULL, `supports_vpnless` INTEGER NOT NULL, `cache_timestamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
                interfaceC37481ol.ATG("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e6dc2489d6d7dd6a7bd1559f3d1eecd6')");
            }

            @Override // X.AbstractC28801aI
            public void dropAllTables(InterfaceC37481ol interfaceC37481ol) {
                interfaceC37481ol.ATG("DROP TABLE IF EXISTS `internal_dev_servers`");
                List list = DevServerDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC72048XLo.A0Q(interfaceC37481ol, it);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public void onCreate(InterfaceC37481ol interfaceC37481ol) {
                List list = DevServerDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A00(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public void onOpen(InterfaceC37481ol interfaceC37481ol) {
                DevServerDatabase_Impl.this.mDatabase = interfaceC37481ol;
                DevServerDatabase_Impl.this.internalInitInvalidationTracker(interfaceC37481ol);
                List list = DevServerDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C2LL) it.next()).A02(interfaceC37481ol);
                    }
                }
            }

            @Override // X.AbstractC28801aI
            public void onPreMigrate(InterfaceC37481ol interfaceC37481ol) {
                C3EP.A01(interfaceC37481ol);
            }
        }, "e6dc2489d6d7dd6a7bd1559f3d1eecd6", "33101b4f13ce603fe64f216109f0c3b8");
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevServerDatabase
    public DevServerDao devServerDao() {
        DevServerDao devServerDao;
        if (this._devServerDao != null) {
            return this._devServerDao;
        }
        synchronized (this) {
            if (this._devServerDao == null) {
                this._devServerDao = new DevServerDao_Impl(this);
            }
            devServerDao = this._devServerDao;
        }
        return devServerDao;
    }

    @Override // X.C1YP
    public void clearAllTables() {
        super.assertNotMainThread();
        InterfaceC37481ol CHx = super.getOpenHelper().CHx();
        try {
            super.beginTransaction();
            CHx.ATG("DELETE FROM `internal_dev_servers`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            AbstractC72049XLp.A0E(CHx);
        }
    }

    @Override // X.C1YP
    public List getAutoMigrations(Map map) {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C1YP
    public Set getRequiredAutoMigrationSpecs() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.C1YP
    public Map getRequiredTypeConverters() {
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC72046XLm.A1Q(DevServerDao.class, A1G);
        return A1G;
    }
}
